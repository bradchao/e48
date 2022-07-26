package tw.brad.e48;

import java.io.File;
import java.io.FileInputStream;

public class Brad47 {

	public static void main(String[] args) {
		File file = new File("dir1/file2.txt");
		long size = file.length();
		try {
			FileInputStream fin = 
					new FileInputStream(file);
			byte[] buf = new byte[(int)size];
			fin.read(buf);
			System.out.print(new String(buf));
			
			fin.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
				
	}

}
