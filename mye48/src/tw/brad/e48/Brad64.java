package tw.brad.e48;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad64 {

	public static void main(String[] args) {
		try {
			File source = new File("dir1/brad.jpg");
			FileInputStream fin = new FileInputStream(source);
			byte[] buf = new byte[(int)source.length()];
			fin.read(buf);
			fin.close();
			
			Socket socket = new Socket(InetAddress.getByName("10.0.100.107"),
					9999);
			
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
			
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
