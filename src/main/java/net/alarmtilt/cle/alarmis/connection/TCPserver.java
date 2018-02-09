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

	@Autowired
	BuildObjetMessageFactoryService buildObjetMessageFactoryService;
	@Autowired
	AlarmisEventApiController alarmisEventApiController;
	/**
	 * 
	 */
	@Autowired
	private LoaderConfigurationService loaderConfigurationService;

	public void startServer()

	{
		try {
			Integer serverPort = loaderConfigurationService != null
					? loaderConfigurationService.getConfigOfService().getPortService() : port;
			ServerSocket listenSocket = new ServerSocket(serverPort);

			log.info("server start listening ... ... ... In port " + serverPort);

			while (true) {
				Socket clientSocket = listenSocket.accept();
				clientSocket.setSoTimeout(loaderConfigurationService != null
						? loaderConfigurationService.getConfigOfService().getTimeOut() : timeOut);
				log.info("THE timeOut OF TCPserver  " + serverPort);
				new Connection(clientSocket, buildObjetMessageFactoryService, alarmisEventApiController);
			}
		} catch (IOException e) {
			log.info("Listen :" + e.getMessage());
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

	public Connection(Socket aClientSocket, BuildObjetMessageFactoryService buildObjetMessageFactoryService,
			AlarmisEventApiController alarmisEventApiController) {

		this.clientSocket = aClientSocket;
		this.buildObjetMessageFactoryService = buildObjetMessageFactoryService;
		this.alarmisEventApiController = alarmisEventApiController;

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

		try {
			pw = new PrintWriter(clientSocket.getOutputStream(), true);
		} catch (IOException e1) {
			log.error("EOF:" + e1.getMessage());
			e1.printStackTrace();
		}

		try {

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
				// br.
				while ((dataLine = br.readLine()) != null) {
					log.info("Reçu data : " + dataLine);
					sbMessage.append(dataLine);
					if (dataLine.startsWith("<?xml"))
						addToBuffer = true;
					if (addToBuffer)
						sb.append(dataLine);
					if (!br.ready())
						break;
				}

				log.info("string Buffer : " + sb);
				AlertMessage alertMessage = new AlertMessage();
				alertMessage = buildObjetMessageFactoryService.parseXMLFile(sb.toString());
				log.info("ALERT MESSAGE with alertMessageObject --> " + alertMessage.toString());

				if (alertMessage != null && alertMessage.getResponseMessage() != null) {
					String responseLength = "Data-Length: " + alertMessage.getResponseMessage().length()
							+ Constants.SKIP_LINE;
					pw.print(responseLength + Constants.SKIP_LINE);
					pw.print(alertMessage.getResponseMessage() + Constants.SKIP_LINE);
					log.info("SEND TO CLIENT -->  " + alertMessage.getResponseMessage());

				}

				pw.flush();
				br.close();
				pw.close();

				if ((Constants.ALARMIS_ALERT_XML_RESPONSE_ACCEPT).equals(alertMessage.getResponseMessage()))
					alarmisEventApiController.launchAlert(alertMessage);
				// Files.write(Paths.get("C:/Users/Yaakoub/test.txt"),

			}

		} catch (IOException e) {
			log.error("EOF:" + e.getMessage());
			AlertMessage alertMessage = new AlertMessage();
			alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_10);
			String responseLength = "Data-Length: " + alertMessage.getResponseMessage().length() + Constants.SKIP_LINE;
			pw.print(responseLength + Constants.SKIP_LINE);
			pw.print(alertMessage.getResponseMessage() + Constants.SKIP_LINE);
			pw.flush();
			pw.close();

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
