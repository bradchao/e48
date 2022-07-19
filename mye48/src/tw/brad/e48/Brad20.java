package tw.brad.e48;

import tw.brad.utils.Bike;

public class Brad20 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.speed);
		System.out.println(b2.speed);
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		b2.upSpeed();b2.upSpeed();b2.upSpeed();b2.downSpeed();
		System.out.println(b1.speed);
		System.out.println(b2.speed);
		
		
		
	}

}
