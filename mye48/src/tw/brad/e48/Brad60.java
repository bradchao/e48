package tw.brad.e48;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Brad60 {

	public static void main(String[] args) {
		byte[] buf = new byte[4*1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			System.out.println("before");
			socket.receive(packet);
			System.out.println("after");
			socket.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
	}

}
