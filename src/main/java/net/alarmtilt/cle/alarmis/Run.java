package net.alarmtilt.cle.alarmis;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Run {

	public static void main(String[] args) throws IOException {

		SocketExample test = new SocketExample();
        test.createSocketServer();

	}
	
	

	class Connection extends Thread {

		DataInputStream input;

		DataOutputStream output;

		Socket clientSocket;

		public Connection(Socket aClientSocket) {
			try {
				clientSocket = aClientSocket;
				input = new DataInputStream(clientSocket.getInputStream());
				output = new DataOutputStream(clientSocket.getOutputStream());
				this.start();
			} catch (IOException e) {
				System.out.println("Connection:" + e.getMessage());
			}
		}

	}
	
	
}

 class SocketExample {
    private ServerSocket middleman;
    private int port = 20007;
    private Socket client;


    protected void createSocketServer()
    {
        try
        {
            while (true){
                middleman = new ServerSocket(port);
                System.out.println("server start listening... ... ...");
                client = middleman.accept();
                middleman.close();
               
                PrintWriter out = new PrintWriter(client.getOutputStream(),true);
                
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                
                BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
                String line = in.readLine();
                System.out.println(line);
              
                while((line = in.readLine()) != null)
                {
                    System.out.println("echo: " + line);
                    out.println("test");
                }
                middleman.close();
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
 }
