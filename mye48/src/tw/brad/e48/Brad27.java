package tw.brad.e48;

import tw.brad.utils.TWId;

public class Brad27 {

	public static void main(String[] args) {
		boolean isRight = TWId.isRightId("A123456789");
		System.out.println(isRight);
		System.out.println(Math.PI);
		
		StringBuffer sb = new StringBuffer();
		sb.append("A");
		System.out.println(sb);
		sb.append("B");
		System.out.println(sb);
		sb.append("Brad")
			.append("Chao")
			.append("Hello");
		System.out.println(sb);
		
		
	}

}
