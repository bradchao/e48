package tw.brad.e48;

public class Brad28 {
	public static void main(String[] args) {
		//Brad281 obj1 = new Brad281();
		//obj1.m1();
		Brad282 obj2 = new Brad282();
		Brad283 obj3 = new Brad283();
		mtest(obj2);
		mtest(obj3);
	}
	
	static void mtest(Brad281 obj) {
		obj.m1();
		obj.m2();
	}
}

abstract class Brad281 {
	void m1() {
		System.out.println("Brad281:m1()");
	}
	abstract void m2();
}
class Brad282 extends Brad281 {
	void m2() {
		System.out.println("Brad282:m2()");
	}
}
class Brad283 extends Brad281 {
	void m2() {
		System.out.println("Brad283:m2()");
	}
}