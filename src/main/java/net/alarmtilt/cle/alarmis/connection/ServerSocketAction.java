package net.alarmtilt.cle.alarmis.connection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketAction {
		
	 private ServerSocket server;
	 
	   public ServerSocketAction(Integer port, String bindAddr) throws Exception {
	        this.server = new ServerSocket(port, 1, InetAddress.getByName(bindAddr));
	    }

	   private void listen() throws Exception {
	        String data = null;
	        Socket client = this.server.accept();
	        String clientAddress = client.getInetAddress().getHostAddress();
	        System.out.println("\r\nNew connection from " + clientAddress);
	        
	        BufferedReader in = new BufferedReader(
	                new InputStreamReader(client.getInputStream())); 
	        DataOutputStream output = new DataOutputStream(client.getOutputStream());
	        output.writeUTF("response from yaakoub server ....");;
	        while ( (data = in.readLine()) != null ) {
	            System.out.println("\r\nMessage from " + clientAddress + ": " + data);
	        }
	    }
	   
	   public InetAddress getSocketAddress() {
	        return this.server.getInetAddress();
	    }
	   
	   public int getPort() {
	        return this.server.getLocalPort();
	    }
	   
	    public static void main(String[] args) throws Exception {
	    	ServerSocketAction app = new ServerSocketAction(Integer.parseInt(args[0]), args[1]);
	        
	        System.out.println("\r\nRunning Server: " + 
	                "Host=" + app.getSocketAddress().getHostAddress() + 
	                " Port=" + app.getPort());
	        
	        app.listen();
	    }

}
