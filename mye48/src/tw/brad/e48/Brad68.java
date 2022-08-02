package tw.brad.e48;

public class Brad68 {
	public static void main(String[] args) {
		Brad682 obj1 = new Brad682();
		test1(obj1);
		Brad683 obj2 = new Brad683();
		test1(obj2);
	}
	
	static void test1(Brad681 obj) {
		obj.m1();
	}
}
interface Brad681 {
	void m1();
	void m2();
}
class Brad682 implements Brad681 {
	public void m1() {}
	public void m2() {}
	void m3() {}
	void m4() {}
}
class Brad683 implements Brad681 {
	public void m1() {}
	public void m2() {}
	void m5() {}
	void m6() {}
}

