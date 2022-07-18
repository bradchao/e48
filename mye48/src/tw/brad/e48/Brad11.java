package tw.brad.e48;

public class Brad11 {

	public static void main(String[] args) {
		int i = 0;
		for ( printBrad() ; i<10 ; printLine()) {
			System.out.println(i++);
		}
	}
	
	static void printBrad() {
		System.out.println("Brad");
	}
	static void printLine() {
		System.out.println("---------");
	}

}
