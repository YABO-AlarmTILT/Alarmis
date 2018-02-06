package net.alarmtilt.cle.alarmis.connection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

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
	@Autowired
	private LoaderConfigurationService loaderConfigurationService;

	public void startServer()

	{
		try {
			int serverPort = loaderConfigurationService != null
					? loaderConfigurationService.getConfigOfService().getPortService() : port;
			ServerSocket listenSocket = new ServerSocket(serverPort);
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
			PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
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

					// Initializing request content
					byte[] request = alertMessage.getResponseMessage().getBytes(StandardCharsets.UTF_8);

					byte[] header = new byte[5];
					ByteBuffer buf = ByteBuffer.wrap(header, 1, 4);
					buf.order(ByteOrder.LITTLE_ENDIAN);

					// Initializing request header
					header[0] = (byte) 0xF0;
					buf.putInt(request.length);
					System.out.println("Sending request to Socket Server");
					// Sending request
					pw.println(header + "\n");
					pw.println(request);
					pw.flush();

					log.info("Message sended to client .... " + alertMessage.getResponseMessage());

					alarmisEventApiController.launchAlert(alertMessage);
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
//				br.close();
//				pw.close();
				clientSocket.close();
			} catch (IOException e) {
				/* close failed */}
		}
	}
}
