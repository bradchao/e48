package tw.brad.e48;

public class Brad32 {
	public static void main(String[] args) {
		Brad321 obj1 = new Brad321();
		Brad322 obj2 = new Brad322();
		Brad323 obj3 = new Brad323();
		Brad321 obj4 = new Brad322();
		Brad321 obj5 = new Brad323();
		//Brad322 obj6 = (Brad322)new Brad321();
		//Brad322 obj7 = (Brad322)new Brad323();
		Brad322 obj7 = (Brad322)obj4;
		Brad324 obj8 = new Brad321();
		Brad324 obj9 = new Brad322();
		Brad324 obj10 = new Brad323();
		Brad325 obj11 = new Brad322();
		
		
		System.out.println("Game Over");
	}
}
interface Brad324 {void m4();}
interface Brad325 {}
class Brad321 implements Brad324 {
	void m1() {System.out.println("Brad321:m1()");	}
	public void m4() {}
}
class Brad322 extends Brad321 implements Brad325 {
	void m1() {System.out.println("Brad322:m1()");	}
	void m2() {System.out.println("Brad322:m1()");}
	void m3() {System.out.println("Brad322:m2()");}
}
class Brad323 extends Brad321 {
	void m1() {System.out.println("Brad323:m1()");	}
	void m2() {System.out.println("Brad323:m1()");}
	void m3() {System.out.println("Brad323:m2()");}
}
