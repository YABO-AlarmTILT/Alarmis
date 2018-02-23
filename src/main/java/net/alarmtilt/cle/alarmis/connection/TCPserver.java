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
	private static final int port = 20000;
	private static final int timeOut = 2000;
	private static final String version = "1.1";

	// @Autowired
	// BuildObjetMessageFactoryService buildObjetMessageFactoryService;
	@Autowired
	AlarmisEventApiController alarmisEventApiController;
	@Autowired
	private LoaderConfigurationService loaderConfigurationService;
	@Autowired
	BuildObjetMessageFactoryService buildObjetMessageFactoryService;

	public void startServer()

	{

		String supportedVesrion = loaderConfigurationService.getConfigOfService().getEclipsVersion().trim() != null
				? loaderConfigurationService.getConfigOfService().getEclipsVersion().trim() : version;
		Integer serverPort = loaderConfigurationService.getConfigOfService().getPortService() != null
				? loaderConfigurationService.getConfigOfService().getPortService() : port;
		Integer serverTimeOut = loaderConfigurationService.getConfigOfService().getTimeOut() != null
				? loaderConfigurationService.getConfigOfService().getTimeOut() : timeOut;
		try {

			ServerSocket listenSocket = new ServerSocket(serverPort);
			log.info("server start listening ... ... ... In port " + serverPort);
			while (true) {
				Socket clientSocket = listenSocket.accept();
				clientSocket.setSoTimeout(serverTimeOut);
				log.info("THE timeOut OF TCPserver  " + serverTimeOut);
				new Connection(clientSocket, alarmisEventApiController, supportedVesrion,
						buildObjetMessageFactoryService);
			}
		} catch (IOException e) {
			log.error("Listen :" + e.getMessage());
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
		log.info("Connexion accept from client socket ....." + aClientSocket);
		this.start();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	public void run() {
		PrintWriter pw = null;
		String alarmisVersion = null;

		try {
			pw = new PrintWriter(clientSocket.getOutputStream(), true);
			// read data from client
			BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			// write to client
			pw = new PrintWriter(clientSocket.getOutputStream(), true);
			String IP = clientSocket.getRemoteSocketAddress().toString();
			log.info("Connexion from IP : " + IP + " and port number : " + clientSocket.getLocalPort());
			while (true) {

				String dataLine;
				boolean addToBuffer = false;
				StringBuffer sb = new StringBuffer();
				StringBuffer sbMessage = new StringBuffer();

				readByteFromClient: while ((dataLine = br.readLine()) != null) {

					log.info("Reçu data : " + dataLine);
					if (dataLine.contains(Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS))
						alarmisVersion = dataLine.substring(dataLine.lastIndexOf(":") + 1).trim();
					sbMessage.append(dataLine);
					if (dataLine.startsWith(Constants.ALARMIS_ALERT_XML_TAG))
						addToBuffer = true;
					if (addToBuffer)
						sb.append(dataLine);
					if (!br.ready() || dataLine.equalsIgnoreCase(Constants.ALARMIS_ALERT_FORMAT_END_TAG))
						break readByteFromClient;

				}
				log.info(
						"************************************* END RECEIVING DATA FROM CLIENT****************************************************");

				if (alarmisVersion.isEmpty()) {
					alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_4);
					log.warn("ERROR MESSAGE IS EMPTY .......");
					throw new Exception(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_4);

				} else if (!alarmisVersion.equals(supportedVesrion)) {
					alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_8);
					log.warn("ERROR VERSION OF ECLIPS MESSENGER NOT SUPPORTED ..." + alarmisVersion);
					throw new Exception(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_8);
				}
				log.info(
						"************************************* SEND DATA FOR PARSING TO XML FILE*********************************************************");
				if (buildObjetMessageFactoryService != null)
					alertMessage = buildObjetMessageFactoryService.parseXMLFile(sb.toString());
				log.info("ALERT MESSAGE with alertMessageObject --> " + alertMessage.toString());

				if (alertMessage != null && alertMessage.getResponseMessage() != null) {
					String responseLength = Constants.ALARMIS_ALERT_FORMAT_RESPONSE_DATA_LENGTH
							+ alertMessage.getResponseMessage().length();

					String responseversion = Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS + supportedVesrion;

					pw.print(responseversion + Constants.SKIP_LINE);
					log.info("Send DATA : " + responseversion);
					pw.print(responseLength + Constants.SKIP_LINE);
					log.info("Send DATA : " + responseLength);
					pw.print(Constants.SKIP_LINE);
					pw.print(alertMessage.getResponseMessage() + Constants.SKIP_LINE);
					log.info("Send DATA : " + alertMessage.getResponseMessage());

					log.info("RESPONSE SENDED TO CLIENT -->  " + alertMessage.getResponseMessage());

				}
				pw.flush();
				br.close();
				pw.close();

				if ((Constants.ALARMIS_ALERT_XML_RESPONSE_ACCEPT).equals(alertMessage.getResponseMessage()))
					alarmisEventApiController.launchAlert(alertMessage);

			}

		} catch (Exception e) {
			boolean sendToClient = true;
			log.error("EOF:" + e.getMessage());

			// AlertMessage alertMessage = new AlertMessage();
			if (e.getMessage().startsWith(Constants.ALARMIS_ALERT_XML_TAG)) {
				alertMessage.setResponseMessage(e.getMessage());

			} else if (alertMessage.getResponseMessage() != null && !alertMessage.getResponseMessage().isEmpty()) {
				log.info(alertMessage.getResponseMessage());
				sendToClient = false;
			} else {
				alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_10);
			}
			if (sendToClient) {
				String responseLength = Constants.ALARMIS_ALERT_FORMAT_RESPONSE_DATA_LENGTH
						+ alertMessage.getResponseMessage().length() + Constants.SKIP_LINE;

				String responseversion = Constants.ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS + supportedVesrion;
				pw.print(responseversion + Constants.SKIP_LINE);
				log.info("Send DATA : " + responseversion + Constants.SKIP_LINE);
				pw.print(responseLength + Constants.SKIP_LINE);
				log.info("Send DATA: " + responseLength);
				pw.print(alertMessage.getResponseMessage() + Constants.SKIP_LINE);
				log.info("Send DATA: " + alertMessage.getResponseMessage());
				pw.flush();
				pw.close();
			}

		}

		finally {
			try {
				clientSocket.close();
			} catch (IOException e) {
				log.error("EOF:" + e.getMessage());
			}
		}

	}

}
