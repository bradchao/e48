package tw.brad.e48;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad51 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/brad1.txt");
			
			int c;
			while ( (c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			
			reader.close();
			System.out.println("OK2");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
