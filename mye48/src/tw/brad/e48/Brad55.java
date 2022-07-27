package tw.brad.e48;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad55 {
	public static void main(String[] args) {
		Brad553 obj = new Brad553();
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(
					new FileOutputStream("dir1/brad553.object"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("save OK");
			
			ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/brad553.object"));
			Brad553 obj2 = (Brad553)oin.readObject();
			oin.close();
			System.out.println("finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
class Brad551 implements Serializable {
	Brad551(){System.out.println("Brad551()");}
}
class Brad552 extends Brad551 {
	Brad552(){System.out.println("Brad552()");}
}
class Brad553 extends Brad552 {
	Brad553(){System.out.println("Brad553()");}
}
