package tw.brad.e48;

import java.io.File;

public class Brad41 {
	public static void main(String[] args) {
		File f1 = new File("d:/brad");
		if (f1.isDirectory()) {
			File[] subs = f1.listFiles();
			for (File file : subs) {
				System.out.println(file.getName());
			}
		}

		
	}
}
