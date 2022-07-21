package tw.brad.e48;

import java.util.HashSet;
import java.util.Set;

import tw.brad.utils.Bike;

public class Brad34 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Brad");
		set.add(123);
		set.add(12.3);
		set.add(new Bike());
		set.add("Brad");
		set.add(123);
		System.out.println(set.size());
		System.out.println(set);
	}

}
