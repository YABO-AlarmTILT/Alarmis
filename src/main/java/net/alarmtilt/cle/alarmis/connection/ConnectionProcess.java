package net.alarmtilt.cle.alarmis.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import net.alarmtilt.cle.alarmis.api.AlarmisEventApiController;
import net.alarmtilt.cle.alarmis.configuration.Constants;
import net.alarmtilt.cle.alarmis.configuration.LoaderConfigurationService;
import net.alarmtilt.cle.alarmis.exception.BadReferenceException;
import net.alarmtilt.cle.alarmis.exception.EmptyMessageException;
import net.alarmtilt.cle.alarmis.exception.VersionErrorException;
import net.alarmtilt.cle.alarmis.model.AlertMessage;
import net.alarmtilt.cle.alarmis.service.BuildObjetMessageFactoryImpl;

@Service
public class ConnectionProcess {

	private static final Logger log = LoggerFactory.getLogger(ConnectionProcess.class);
	@Autowired
	BuildObjetMessageFactoryImpl buildObjetMessageFactoryService;
	@Autowired
	AlarmisEventApiController alarmisEventApiController;
	@Autowired
	LoaderConfigurationService loaderConfigurationService;
	
	String appVersion = loaderConfigurationService != null
			? loaderConfigurationService.getConfigOfService().getEclipsVersion() : "1.1";

	Integer nbrEmptyMessage = 0;

	/*
	 * 
	 */
	public ConnectionProcess() {
		super();
	}

	/**
	 * Process Alarms coming from alarmis server
	 * 
	 * @param clientSocket
	 * @throws InterruptedException
	 */
	@Async
	public void process(Socket clientSocket) throws InterruptedException {
		log.info("I'm in connection run ..... Current Thread :  {}", Thread.currentThread().getName());
		AlertMessage alertMessage = new AlertMessage();

		while (!clientSocket.isClosed()) {
			try {
				int TotaltimeToSleep = 50;
				StringBuffer sb = messageRead(clientSocket, 50);

				if (sb.toString().isEmpty()) {
					int timeToSleep;
					int nbrOfRetry = loaderConfigurationService != null
							? loaderConfigurationService.getConfigOfService().getNbrOfRetry() : 4;

					RetryLoop: for (int i = 1; i < nbrOfRetry; i++) {
						if (sb.toString().isEmpty()) {
							log.info("Retry to read number :  .................{}", i);
							timeToSleep = i * 100;
							TotaltimeToSleep += timeToSleep;
							sb = messageRead(clientSocket, timeToSleep);

							log.info("SLEEP AFTER RETRY ..... Done ");
						} else {
							log.info(
									"successfully Retry to read {} times  with total of sleepin thread:  ................{}",
									i, TotaltimeToSleep);
							break RetryLoop;
						}
					}
				}

				if (sb.toString().isEmpty()) {
					nbrEmptyMessage++;
					log.info("Number of emty messge {} ", nbrEmptyMessage);
					log.info("Time to sleep .... is << {} >>  ", TotaltimeToSleep);
					throw new EmptyMessageException();

				}

				// check alarmis version
				checkAlarmisVersion(sb, alertMessage);

				// build xml message
				String xmlAlarme = getXmlAlarmeFromData(sb, alertMessage);

				if (xmlAlarme != null) {
					alertMessage = buildObjetMessageFactoryService.parseXMLFile(xmlAlarme);
					log.info("ALERT MESSAGE with alertMessageObject --> {}", alertMessage);
				}

				if (alertMessage != null && alertMessage.getResponseMessage() != null)
					responseToSend(alertMessage, clientSocket);

			} catch (IOException e) {
				log.error("EOF:{}", e);
				e.printStackTrace();
			} catch (EmptyMessageException e) {
				log.error("EOF:{}", e);
				e.printStackTrace();
				alertMessage.setResponseMessage(e.getXmlMessage());
				responseToSend(alertMessage, clientSocket);

			} catch (VersionErrorException e) {
				log.error("EOF:{}", e);
				e.printStackTrace();
				alertMessage.setResponseMessage(e.getXmlMessage());
				responseToSend(alertMessage, clientSocket);

			} catch (BadReferenceException e) {
				log.error("EOF:{}", e);
				e.printStackTrace();
				alertMessage.setResponseMessage(e.getXmlMessage());
				responseToSend(alertMessage, clientSocket);

			} finally {
				try {
					clientSocket.close();
					if ((Constants.ALARMIS_ALERT_XML_RESPONSE_ACCEPT).equals(alertMessage.getResponseMessage()))
						alarmisEventApiController.launchAlert(alertMessage);
				} catch (IOException e) {
					log.error("EOF:{}", e);
					e.printStackTrace();
				}

			}
		}
	}

	/**
	 * Function to read byts sending by client and timeToSleep refrence time to
	 * wait to get data from client
	 * 
	 * @param clientSocket
	 * @param timeToSleep
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	StringBuffer messageRead(Socket clientSocket, Integer timeToSleep) throws IOException, InterruptedException {

		log.info("SLEEP ..... {}ms ", timeToSleep);
		Thread.sleep(timeToSleep);
		log.info("SLEEP ..... Done ");

		clientSocket.setKeepAlive(true);
		BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		StringBuffer sb = new StringBuffer();
		while (br.ready()) {
			char[] c = new char[] { 1024 };
			br.read(c);
			sb.append(c);
		}
		log.info("GET data :{} ", sb.toString());

		return sb;
	}

	/**
	 * Get version from data receiving exemple e-CLIPS: 1.1
	 * 
	 * @param sb
	 * @throws VersionErrorException
	 * @throws Exception
	 */
	void checkAlarmisVersion(StringBuffer sb, AlertMessage alertMessage) throws VersionErrorException {

		// get alarmis version from data receiving
		boolean isVersionSupported = sb.toString()
				.contains(Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS + appVersion);

		if (!isVersionSupported) {
			alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_8);
			log.warn("WARN VERSION OF ECLIPS MESSENGER NOT SUPPORTED ...");
			throw new VersionErrorException();
		}
	}

	/**
	 * Get xml message from data receiving
	 * 
	 * @param sb
	 * @return
	 * @throws BadReferenceException
	 * @throws Exception
	 */
	String getXmlAlarmeFromData(StringBuffer sb, AlertMessage alertMessage) throws BadReferenceException {
		String getXmlMessage = null;
		// get xml message from data receiving
		getXmlMessage = sb.toString().contains(Constants.ALARMIS_ALERT_XML_TAG)
				? sb.substring(sb.toString().lastIndexOf(Constants.ALARMIS_ALERT_XML_TAG)) : null;
		log.info("XML message getting from client {}", getXmlMessage);

		if (getXmlMessage == null) {
			alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_4);
			log.warn("WARN MESSAGE THERE IS NO XML TAG");
			throw new BadReferenceException();
		}
		return getXmlMessage;
	}

	void responseToSend(AlertMessage alertMessage, Socket clientSocket) {
		try (PrintWriter pw = new PrintWriter(clientSocket.getOutputStream())) {

			String responseversion = Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS + appVersion;
			String responseLength = Constants.ALARMIS_ALERT_FORMAT_RESPONSE_DATA_LENGTH
					+ alertMessage.getResponseMessage().length();
			pw.print(responseversion + Constants.SKIP_LINE);
			log.info(Constants.ALARMIS_LOGGER_SEND_DATA, responseversion);
			pw.print(responseLength + Constants.SKIP_LINE);
			log.info(Constants.ALARMIS_LOGGER_SEND_DATA, responseLength);
			pw.print(Constants.SKIP_LINE);
			pw.print(alertMessage.getResponseMessage() + Constants.SKIP_LINE);
			log.info(Constants.ALARMIS_LOGGER_SEND_DATA, alertMessage.getResponseMessage());

			pw.flush();
			pw.close();
			clientSocket.close();
			log.info("Print writer and socket closed, Thread-{}", Thread.currentThread().getName());

		} catch (IOException e) {
			log.error("error {} ", e);
		}

	}
}
