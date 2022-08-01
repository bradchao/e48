package tw.brad.e48;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad61 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			System.out.println("wait......");
			Socket socket = server.accept();
			
			InputStream in = socket.getInputStream();
			byte[] buf = new byte[8];
			int len;
			StringBuffer sb = new StringBuffer();
			while ( (len = in.read(buf)) != -1) {
				sb.append(new String(buf,0,len));
			}
			in.close();
			
			server.close();
			System.out.println("OK:" + sb.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
