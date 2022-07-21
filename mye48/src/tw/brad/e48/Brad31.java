package tw.brad.e48;

public class Brad31 {
	public static void main(String[] args) {
		Brad312 obj1 = new Brad312();
		obj1.m1();
		//obj1.m
	}
}
class Brad311 {
	void m1() {
		System.out.println("Brad311:m1()");
	}
	protected byte m2() {
		System.out.println("Brad311:m2()");
		return 1;
	}
	Brad314 m3() {
		return null;
	}
}
class Brad312 extends Brad311 {
	void m1() {
		System.out.println("Brad312:m1()");
		super.m1();
	}
	public byte m2() {
		return 1;
	}
	Brad315 m3() {
		return null;
	}
}
class Brad313{}
class Brad314 extends Brad313 {}
class Brad315 extends Brad314 {}
class Brad316 extends Brad313 {}



