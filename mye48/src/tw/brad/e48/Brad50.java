package tw.brad.e48;

import java.io.FileWriter;
import java.io.IOException;

public class Brad50 {

	public static void main(String[] args) {
		String mesg = "大家好, 嘔素Brad\n1234567\n7654321";
		FileWriter writer;
		try {
			writer = new FileWriter("dir1/brad1.txt");
			writer.write(mesg);
			writer.flush();
			writer.close();
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
