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
import net.alarmtilt.cle.alarmis.configuration.LoaderConfigurationService;
import net.alarmtilt.cle.alarmis.model.AlertMessage;
import net.alarmtilt.cle.alarmis.service.BuildObjetMessageFactoryService;

@Component
public class TCPserver {

	private static final Logger log = LoggerFactory.getLogger(TCPserver.class);
	private static final int port = 20000;

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
			int serverPort = loaderConfigurationService != null
					? loaderConfigurationService.getConfigOfService().getPortService() : port;
			ServerSocket listenSocket = new ServerSocket(30000);
			log.info("server start listening ... ... ... In port " + serverPort);

			while (true) {
				Socket clientSocket = listenSocket.accept();
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

		try {
			// read data from client
			BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			// write to client
			PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
			String IP = clientSocket.getRemoteSocketAddress().toString();

			log.info("Connexion from IP : " + IP);
			log.info("Connexion succed with IP client:  " + IP + " and port number : " + clientSocket.getLocalPort());
			pw.println("Connexion succed with IP client:  " + IP + " and port number : " + clientSocket.getLocalPort());

			while (true) {

				String dataLine;
				boolean addToBuffer = false;
				StringBuffer sb = new StringBuffer();
				while ((dataLine = br.readLine()) != null) {
					log.info("Reçu data : " + dataLine);
					if (dataLine.startsWith("<?xml"))
						addToBuffer = true;
					if (addToBuffer)
						sb.append(dataLine);
					if (dataLine.equals("</message>"))
						break;
				}
				log.info("string Buffer : " + sb);
				AlertMessage alertMessage = buildObjetMessageFactoryService.parseXMLFile(sb.toString());

				if (alertMessage != null) {

					String response = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"accept\"/>\n";
					String responseLength = "Data-Length: " + response.length()+"\n";
					pw.print(responseLength);
					pw.print("\n");
					pw.print(response);
					pw.flush();

					System.out.println("Sending request to Socket Server");
					// Sending request
					// pw.println(response1);
					// pw.print(response);

					// pw.close();
					// clientSocket.close();
					log.info("Message sended to client .... " + alertMessage.getResponseMessage());

					// alarmisEventApiController.launchAlert(alertMessage);
				}
				// Files.write(Paths.get("C:/Users/Yaakoub/test.txt"),
				// sb.toString().getBytes());

				// br.close();
				// pw.close();

			}

		} catch (IOException e) {
			log.info("EOF:" + e.getMessage());
		}

		finally {
			try {
				// br.close();
				// pw.close();
				clientSocket.close();
			} catch (IOException e) {
				/* close failed */}
		}
	}
}
