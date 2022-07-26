package tw.brad.e48;

import java.io.File;

public class Brad42 {

	public static void main(String[] args) {
		File dir3 = new File("./dir3");
		if (!dir3.exists()) {
			dir3.mkdir();
		}else {
			System.out.println("dir3 exist!");
		}
	}

}
