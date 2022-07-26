package tw.brad.e48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad49 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/test.mp4");
			FileOutputStream fout = new FileOutputStream("dir2/brad2.mp4");
			
			int len; byte[] buf = new byte[1024*1024];
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("Finish2:" + (System.currentTimeMillis()-start));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
