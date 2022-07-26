package tw.brad.e48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad48 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/test.mp4");
			FileOutputStream fout = new FileOutputStream("dir2/brad.mp4");
			
			int data;
			while ((data = fin.read()) != -1) {
				fout.write(data);
			}
			
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("Finish:" + (System.currentTimeMillis()-start));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
