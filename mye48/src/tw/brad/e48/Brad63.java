package tw.brad.e48;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad63 {

	public static void main(String[] args) {
		while (true) {
			try {
				ServerSocket server = new ServerSocket(9999);
				System.out.println("wait......4");
				Socket socket = server.accept();
				
				String urip = socket.getInetAddress().getHostAddress();
				System.out.println("ip => " + urip);
				
				FileOutputStream fout = new FileOutputStream("dir1/" + urip + ".jpg");
				
				InputStream in = socket.getInputStream();
				byte[] buf = new byte[1024*1024]; int len;
				while ( (len = in.read(buf)) != -1) {
					fout.write(buf, 0, len);
				}
				
				fout.flush();
				fout.close();
				
				in.close();
				
				socket.close();
					
				server.close();
				System.out.println(urip + ": OK");
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
	}

}
