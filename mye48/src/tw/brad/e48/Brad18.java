package tw.brad.e48;

public class Brad18 {

	public static void main(String[] args) {
		// 1 + 2 + ... + n = ?
		int i = 1;
		int sum = 0;
		int n = 100;
		while (i <=n) {
			sum += i;	// 1 + 2 + 3 + ... + 8 + 9 + 10
			i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d\n", n, sum);
		System.out.println("---");
		i = 1; sum = 0;
		for (;i <=n;) {
			sum += i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d\n", n, sum);
		
		
		
	}

}
