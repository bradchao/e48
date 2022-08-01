package tw.brad.e48;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad62 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(InetAddress.getByName("10.0.100.107"), 7777);
			
			OutputStream out = socket.getOutputStream();
			out.write("Hello, World".getBytes());
			out.flush();
			out.close();
			
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
