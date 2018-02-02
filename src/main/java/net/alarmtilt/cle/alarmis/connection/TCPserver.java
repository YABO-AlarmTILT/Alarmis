package net.alarmtilt.cle.alarmis.connection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TCPserver {

	private static final Logger log = LoggerFactory.getLogger(TCPserver.class);

	public void startServer()

	{
		try {
			int serverPort = 30010;
			ServerSocket listenSocket = new ServerSocket(serverPort);
			log.info("server start listening ... ... ... In port " + serverPort);

			while (true) {
				Socket clientSocket = listenSocket.accept();
				new Connection(clientSocket);
			}
		} catch (IOException e) {
			log.info("Listen :" + e.getMessage());
		}
	}
}

class Connection extends Thread {

	private static final Logger log = LoggerFactory.getLogger(Connection.class);
	// DataInputStream input;
	// DataOutputStream output;
	Socket clientSocket;

	public Connection(Socket aClientSocket) {

		clientSocket = aClientSocket;
		log.info("Connexion accept from client socket ....." +aClientSocket);
		// input = new DataInputStream(clientSocket.getInputStream());
		// output = new DataOutputStream(clientSocket.getOutputStream());
		this.start();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	public void run() {

		try {
			//read data from client
			BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			
			//BufferedWriter bw = Files.newBufferedWriter(Paths.get("C:/Users/Yaakoub/Desktop/responseToAlarmis.xml"));
			
			//write to client
			PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());

			String IP = clientSocket.getRemoteSocketAddress().toString();
			log.info("Connexion from IP : " + IP);

			pw.println("Connexion succed with IP client:  " + IP + " and port number : " + clientSocket.getLocalPort());
			while (true) {

				String dataLine;
				StringBuffer sb = new StringBuffer();
				while ((dataLine = br.readLine()) != null) {
					log.info("Reçu data : " + dataLine);
					sb.append(dataLine);
					bw.write("Bissmilah from bw");
					pw.println("Bissmilah from pw");
					pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"accept\" />");
					bw.flush();
					pw.flush();
				}
				log.info("string Buffer : " + sb);
				Files.write(Paths.get("C:/Users/Yaakoub/test.txt"), sb.toString().getBytes());

				br.close();
				pw.close();

			}

		} catch (IOException e) {
			log.info("EOF:" + e.getMessage());
		}

		finally {
			try {
				clientSocket.close();
			} catch (IOException e) {
				/* close failed */}
		}
	}
}
