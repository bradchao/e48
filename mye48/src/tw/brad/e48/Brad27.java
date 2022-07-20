package tw.brad.e48;

import tw.brad.utils.TWId;

public class Brad27 {

	public static void main(String[] args) {
		boolean isRight = TWId.isRightId("A123456789");
		System.out.println(isRight);
		System.out.println(Math.PI);
		
		TWId id1 = new TWId();
		TWId id2 = new TWId(true);
		TWId id3 = new TWId(1);
		TWId id4 = new TWId(false, 5);
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		TWId id5 = TWId.createTWId("Y120239848");
		if (id5 != null) {
			System.out.println(id5.getId());
		}
		
		
	}

}
