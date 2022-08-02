package tw.brad.e48;

public class Jdbc01 {

	public static void main(String[] args) {
		try {
			Class.forName("brad");
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}

}
