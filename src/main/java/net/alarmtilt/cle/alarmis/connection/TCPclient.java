package net.alarmtilt.cle.alarmis.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPclient {

	private Socket socket;

	private TCPclient(String serverAddress, int serverPort) throws Exception {
		this.socket = new Socket(serverAddress, serverPort);
	}

	public static void main(String[] args) throws NumberFormatException, UnknownHostException, Exception {
		TCPclient client = new TCPclient("localhost", 20000);

		System.out.println("\r\nConnected to: " + client.socket.getInetAddress());
		client.start();

	}

	private void start() throws IOException {
		String input;
		BufferedReader br = null;
		boolean endLoop = true;
		boolean endSecondeLoop = true;
		while (endLoop) {
			input = " e-CLIPS: 1.1\n";
			input += "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";
			input += "<message pwd=\"alatil222018\" sid=\"\" uid=\"alatil\" name=\"generic alert\" destination=\"AlarmTILT\">\n";
			input += "<generic_alert account=\"8034\" event=\"ZA\" zone= \"11\" />\n";
			input += "</message>\n";
			PrintWriter out = new PrintWriter(this.socket.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.println(input);
			out.flush();
			out.close();
			endLoop = false;
			
			// br.readLine();
			String dataLine = null;
			while (endSecondeLoop) {
				while ((dataLine = br.readLine()) != null) {
					System.out.println("Reçu data : " + dataLine);
					if (br.ready())
						endSecondeLoop = false;;

				}
				
			}
			
		}
		
	}
}
