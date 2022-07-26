package tw.brad.e48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad45 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("dir1/file2.txt");
			int d = fin.read();
			System.out.println((char)d);
			d = fin.read();
			System.out.println((char)d);
			d = fin.read();
			System.out.println((char)d);
			
			fin.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
				
	}

}
