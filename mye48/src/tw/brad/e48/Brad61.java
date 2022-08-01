package tw.brad.e48;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad61 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8884);
			System.out.println("wait......4");
			Socket socket = server.accept();
			
			String urip = socket.getInetAddress().getHostAddress();
			System.out.println("ip => " + urip);
			
			InputStream in = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(in);
			BufferedReader reader = new BufferedReader(ir);
			
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null) {
				//sb.append(line + "\n");
				System.out.println(line + "\n");
			}
			in.close();
			
			socket.close();
				
			server.close();
			System.out.println("Server OK");
			System.out.println(urip + ":" + sb.toString());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
