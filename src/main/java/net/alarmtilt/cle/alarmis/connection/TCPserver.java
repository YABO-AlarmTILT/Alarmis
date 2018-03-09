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
import net.alarmtilt.cle.alarmis.model.AlertMessage;
import net.alarmtilt.cle.alarmis.service.BuildObjetMessageFactoryService;

@Component
public class TCPserver extends Thread {

	private static final Logger log = LoggerFactory.getLogger(TCPserver.class);
	private static final int PORT = 20000;
	private static final int TIMEOUT = 2000;

	@Autowired
	AlarmisEventApiController alarmisEventApiController;
	@Autowired
	BuildObjetMessageFactoryService buildObjetMessageFactoryService;

	@Override
	public void run() {
		Integer nbrConnexion = 0;

		try {
			ServerSocket listenSocket = new ServerSocket(PORT);
			log.info("I'm in server instance ....Current Thread : {}", Thread.currentThread().getName());
			log.info("server start listening ... ... ... In port {}", listenSocket.getLocalPort());
			log.info("local address of this server socket {}... ... ...  ", listenSocket.getInetAddress());
			log.info("address of the endpoint this socket is bound to {}..... ", listenSocket.getLocalSocketAddress());
			log.info("the server-socket channel associated with this socket {} ..... ", listenSocket.getChannel());
			log.info("..........");

			while (true) {
				Socket clientSocket = listenSocket.accept();
				clientSocket.setSoTimeout(TIMEOUT);
				nbrConnexion++;

				log.info("Client connected connexion number ... " + nbrConnexion);
				log.info("local address to which the socket is bound ... " + clientSocket.getLocalAddress());
				log.info("IP address to which this socket is connected ... " + clientSocket.getInetAddress());
				log.info("THE timeOut OF TCPserver " + TIMEOUT);
				log.info("..........");

				// create new socket connection in thread
				new Connection(clientSocket, alarmisEventApiController, buildObjetMessageFactoryService).start();

			}
		} catch (IOException e) {
			log.error("ERROR ... {}", e);
			log.error("May be port {} busy.",PORT);
		}
	}

}

class Connection extends Thread {

	private static final Logger log = LoggerFactory.getLogger(Connection.class);
	Socket clientSocket;
	BuildObjetMessageFactoryService buildObjetMessageFactoryService;
	AlarmisEventApiController alarmisEventApiController;
	// private String supportedVesrion;

	public Connection(Socket aClientSocket, AlarmisEventApiController alarmisEventApiController,
			BuildObjetMessageFactoryService buildObjetMessageFactoryService) {
		super();
		this.clientSocket = aClientSocket;
		this.alarmisEventApiController = alarmisEventApiController;
		this.buildObjetMessageFactoryService = buildObjetMessageFactoryService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	public void run() {
		log.info("I'm in connection run ..... Current Thread :  {}", Thread.currentThread().getName());
		AlertMessage alertMessage = new AlertMessage();
		try {

			while (true) {
				BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				StringBuffer sb = new StringBuffer();
				while (br.ready()) {
					char[] c = new char[] { 1024 };
					br.read(c);
					sb.append(c);
				}
				log.info("GET data :{} ", sb.toString());
				if (sb.toString().contains(Constants.ALARMIS_ALERT_FORMAT_RESPONSE_DATA_LENGTH + 0))
					throw new Exception(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_11);
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

				if ((Constants.ALARMIS_ALERT_XML_RESPONSE_ACCEPT).equals(alertMessage.getResponseMessage()))
					alarmisEventApiController.launchAlert(alertMessage);

			}

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
				responseToSend(alertMessage, clientSocket);
		}

		finally {
			try {

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
	private void checkAlarmisVersion(StringBuffer sb, AlertMessage alertMessage) throws Exception {

		// get alarmis version from data receiving
		boolean isVersionSupported = sb.toString()
				.contains(Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS + "1.1");

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
	private String getXmlAlarmeFromData(StringBuffer sb, AlertMessage alertMessage) throws Exception {
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

	private void responseToSend(AlertMessage alertMessage, Socket clientSocket) {
		try (PrintWriter pw = new PrintWriter(clientSocket.getOutputStream())) {

			String responseversion = Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS + "1.1";
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
