package tw.brad.e48;

public class Brad39 {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int[] ary = {1,2,3,4};
		System.out.println("Hello, World");
		try {
			int c = a / b;
			System.out.println(ary[3]);
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("Oooop1!");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Oooop2!");
		}catch (RuntimeException e) {
			System.out.println("Oooop3!");
		}
		System.out.println("Game Over");
	}

}
