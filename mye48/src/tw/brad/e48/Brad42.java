package tw.brad.e48;

import java.io.File;

public class Brad42 {

	public static void main(String[] args) {
		File dir6 = new File("./dir3/dir4/dir5/dir6");
		if (!dir6.exists()) {
			System.out.println("create dir6");
			dir6.mkdirs();
		}else {
			System.out.println("dir6 exist!");
		}
	}

}
