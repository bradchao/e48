package tw.brad.e48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad46 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("dir1/file2.txt");
			byte[] buf = new byte[3];
			int len = 0;
			while ( (len = fin.read(buf)) != -1) {
				System.out.print(new String(buf));
			}
			
			fin.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
				
	}

}
