package tw.brad.e48;

public class Brad12 {

	public static void main(String[] args) {

		int v = 13;
		boolean isPrime = true;
		for (int i = 2; i< v; i++) {
			if (v % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.printf("%d => %d", v, isPrime?1:0);
	}

}
