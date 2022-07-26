package tw.brad.e48;

import java.io.File;

public class Brad43 {

	public static void main(String[] args) {
		File f1 = new File("./dir1/file2.txt");
		File f2 = new File("./dir2/file1.txt");
		f2.renameTo(f1);
	}

}
