package tw.brad.e48;

public class Brad30 {
	public static void main(String[] args) {
		Brad301 obj1 = new Brad301();
		obj1.m1();
		//obj1.m1((byte)10, (byte)3);
	}
}
class Brad301 {
	void m1() {
		System.out.println("Brad301:m1()");
	}
	void m1(int a) {
		System.out.println("Brad301:m1(int)");
	}
	public void m1(int a, byte b) {
		System.out.println("Brad301:m1(int, byte)");
	}
	protected int m1(byte a, int b) {
		System.out.println("Brad301:m1(byte, int)");
		return 1;
	}
}
