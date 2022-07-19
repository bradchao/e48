package tw.brad.e48;

public class Brad19 {

	public static void main(String[] args) {
		int a = -10, b = 4;
		a = a ^ b;	// a = 13
		b = a ^ b;	// b = 10
		a = a ^ b;	// a = 3
		System.out.printf("a = %d, b = %d", a, b);
	}

}
