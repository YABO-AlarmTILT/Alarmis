package net.alarmtilt.cle.alarmis.connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TCPserver {

	private static final Logger log = LoggerFactory.getLogger(TCPserver.class);
	private static final int PORT = 20000;
	private static final int TIMEOUT = 5000;
	@Autowired
	ConnectionProcess connProcess;

	public void startServer() throws InterruptedException {
		Integer nbrConnexion = 0;

		try {
			ServerSocket listenSocket = new ServerSocket(PORT);
			log.info("I'm in server instance ....Current Thread : {}", Thread.currentThread().getName());
			log.info("server start listening ... ... ... In port {}", listenSocket.getLocalPort());
			log.info("local address of this server socket {}... ... ...  ", listenSocket.getInetAddress());
			log.info("address of the endpoint this socket is bound to {}..... ", listenSocket.getLocalSocketAddress());
			log.info("the server-socket channel associated with this socket {} ..... ", listenSocket.getChannel());
			log.info("Time out of server ... << {} >>", TIMEOUT);
			log.info("..........");

			while (!listenSocket.isClosed()) {
				Socket clientSocket = listenSocket.accept();
				clientSocket.setSoTimeout(TIMEOUT);
				nbrConnexion++;

				log.info("Client connected connexion number ... " + nbrConnexion);
				log.info("local address to which the socket is bound ... " + clientSocket.getLocalAddress());
				log.info("IP address to which this socket is connected ... " + clientSocket.getInetAddress());
				log.info("THE timeOut OF TCPserver " + TIMEOUT);
				log.info("..........");

				// create new socket connection in a new thread
				connProcess.process(clientSocket);

			}
		} catch (IOException e) {
			log.error("ERROR ... {}", e);
			log.error("May be port {} busy.", PORT);
		}
	}

}
