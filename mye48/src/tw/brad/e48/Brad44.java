package tw.brad.e48;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad44 {

	public static void main(String[] args) {
		String mesg = "7654321\n";
		byte[] msg = mesg.getBytes();
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file1.txt", true);
			fout.write(msg);
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (FileNotFoundException e) {
			System.out.println("e1");
		} catch (IOException e) {
			System.out.println("e1");
		}
		
	}

}
