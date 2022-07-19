package tw.brad.e48;

import tw.brad.utils.Bike;
import tw.brad.utils.Scooter;

public class Brad20 {

	public static void main(String[] args) {
		Bike b1 = new Bike(4);
		Scooter s1 = new Scooter();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();
		s1.upSpeed();s1.upSpeed();s1.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
		
		
		
	}

}
