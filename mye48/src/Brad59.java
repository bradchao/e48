import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad59 {

	public static void main(String[] args) {
		String mesg = "Hello, World";
		byte[] msg = mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(msg, msg.length, 
					InetAddress.getByName("10.0.100.108"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
