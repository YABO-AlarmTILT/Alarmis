package net.alarmtilt.cle.alarmis.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.alarmtilt.cle.alarmis.api.AlarmisEventApiController;
import net.alarmtilt.cle.alarmis.configuration.Constants;
import net.alarmtilt.cle.alarmis.configuration.LoaderConfigurationService;
import net.alarmtilt.cle.alarmis.model.AlertMessage;
import net.alarmtilt.cle.alarmis.service.BuildObjetMessageFactoryService;

@Component
public class TCPserver {

	private static final Logger log = LoggerFactory.getLogger(TCPserver.class);
	private static final int PORT = 20000;
	private static final int TIMEOUT = 2000;
	private static final String VERSION = "1.1";

	@Autowired
	AlarmisEventApiController alarmisEventApiController;
	@Autowired
	private LoaderConfigurationService loaderConfigurationService;
	@Autowired
	BuildObjetMessageFactoryService buildObjetMessageFactoryService;

	public void startServer()

	{
		Integer nbrConnexion = 0;

		String supportedVesrion = loaderConfigurationService.getConfigOfService().getEclipsVersion().trim() != null
				? loaderConfigurationService.getConfigOfService().getEclipsVersion().trim() : VERSION;
		Integer serverPort = loaderConfigurationService.getConfigOfService().getPortService() != null
				? loaderConfigurationService.getConfigOfService().getPortService() : PORT;
		Integer serverTimeOut = loaderConfigurationService.getConfigOfService().getTimeOut() != null
				? loaderConfigurationService.getConfigOfService().getTimeOut() : TIMEOUT;

		try (ServerSocket listenSocket = new ServerSocket(serverPort)) {

			log.info("server start listening ... ... ... In port {}", listenSocket.getLocalPort());
			log.info("local address of this server socket {}... ... ...  ", listenSocket.getInetAddress());
			log.info("address of the endpoint this socket is bound to {}..... ", listenSocket.getLocalSocketAddress());
			log.info("the server-socket channel associated with this socket {} ..... ", listenSocket.getChannel());
			log.info("..........");

			while (true) {
				Socket clientSocket = listenSocket.accept();
				clientSocket.setSoTimeout(serverTimeOut);
				nbrConnexion++;

				log.info("Client connected connexion number ... " + nbrConnexion);
				log.info("local address to which the socket is bound ... " + clientSocket.getLocalAddress());
				log.info("IP address to which this socket is connected ... " + clientSocket.getInetAddress());
				log.info("THE timeOut OF TCPserver  " + serverTimeOut);
				log.info("..........");

				// create new socket connection in thread
				new Connection(clientSocket, alarmisEventApiController, supportedVesrion,
						buildObjetMessageFactoryService);
				if (nbrConnexion > Integer.MAX_VALUE)
					break;

			}
		} catch (IOException e) {
			log.error("ERROR ... {}", e);
		}

	}
}

class Connection extends Thread {

	private static final Logger log = LoggerFactory.getLogger(Connection.class);
	Socket clientSocket;
	@Autowired
	BuildObjetMessageFactoryService buildObjetMessageFactoryService;
	@Autowired
	AlarmisEventApiController alarmisEventApiController;
	private String supportedVesrion;
	AlertMessage alertMessage = new AlertMessage();

	public Connection(Socket aClientSocket, AlarmisEventApiController alarmisEventApiController,
			String supportedVesrion, BuildObjetMessageFactoryService buildObjetMessageFactoryService) {

		this.clientSocket = aClientSocket;
		this.alarmisEventApiController = alarmisEventApiController;
		this.supportedVesrion = supportedVesrion;
		this.buildObjetMessageFactoryService = buildObjetMessageFactoryService;
		log.info("Connexion accept from client socket ....." + aClientSocket.getInetAddress());
		this.start();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	public void run() {

		BufferedReader br = null;
		try {

			br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			StringBuffer sb = new StringBuffer();

			while (br.ready()) {
				char[] c = new char[] { 1024 };
				br.read(c);
				sb.append(c);
			}
			log.info("Reçu data :{} ", sb.toString());
			if (sb.toString().contains(Constants.ALARMIS_ALERT_FORMAT_RESPONSE_DATA_LENGTH + 0))
				throw new Exception(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_11);
			// check alarmis version
			checkAlarmisVersion(sb);

			// build xml message
			String xmlAlarme = getXmlAlarmeFromData(sb);

			if (xmlAlarme != null) {
				alertMessage = buildObjetMessageFactoryService.parseXMLFile(xmlAlarme);
				log.info("ALERT MESSAGE with alertMessageObject --> {}", alertMessage);
			}

			if (alertMessage != null && alertMessage.getResponseMessage() != null)
				responseToSend();

			if ((Constants.ALARMIS_ALERT_XML_RESPONSE_ACCEPT).equals(alertMessage.getResponseMessage()))
				alarmisEventApiController.launchAlert(alertMessage);

		} catch (Exception e) {
			boolean sendToClient = true;
			log.error("EOF:" + e.getMessage());
			if (e.getMessage().startsWith(Constants.ALARMIS_ALERT_XML_TAG)) {
				alertMessage.setResponseMessage(e.getMessage());

			} else if (alertMessage.getResponseMessage() != null && !alertMessage.getResponseMessage().isEmpty()) {
				log.info(alertMessage.getResponseMessage());
				sendToClient = false;
			} else {
				alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_10);
			}

			if (sendToClient)
				responseToSend();
		}

		finally {
			try {
				br.close();
				clientSocket.close();
			} catch (IOException e) {
				log.error("EOF:" + e.getMessage());
			}
		}

	}

	/**
	 * Get version from data receiving exemple e-CLIPS: 1.1
	 * 
	 * @param sb
	 * @throws Exception
	 */
	private void checkAlarmisVersion(StringBuffer sb) throws Exception {
		// get alarmis version from data receiving
		boolean isVersionSupported = sb.toString()
				.contains(Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS + supportedVesrion);

		if (!isVersionSupported) {
			alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_8);
			log.warn("WARN VERSION OF ECLIPS MESSENGER NOT SUPPORTED ...");
			throw new Exception(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_8);
		}
	}

	/**
	 * Get xml message from data receiving
	 * 
	 * @param sb
	 * @return
	 * @throws Exception
	 */
	private String getXmlAlarmeFromData(StringBuffer sb) throws Exception {
		String getXmlMessage = null;
		// get xml message from data receiving
		getXmlMessage = sb.toString().contains(Constants.ALARMIS_ALERT_XML_TAG)
				? sb.substring(sb.toString().lastIndexOf(Constants.ALARMIS_ALERT_XML_TAG)) : null;
		log.info("XML message getting from client {}", getXmlMessage);

		if (getXmlMessage == null) {
			alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_4);
			log.warn("WARN MESSAGE THERE IS NO XML TAG");
			throw new Exception(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_4);
		}
		return getXmlMessage;
	}

	private void responseToSend() {
		try (PrintWriter pw = new PrintWriter(clientSocket.getOutputStream())) {

			String responseversion = Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS + supportedVesrion;
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

		} catch (IOException e) {
			log.error("error {} ", e);
		}

	}

}
