package tw.brad.e48;

public class Brad13 {

	public static void main(String[] args) {
		int[] a;
		int[] b;
		b = new int[]{4,5,6};
		a = new int[2];
		System.out.println(b[0]);
		System.out.println(b[1]);
		//System.out.println(a[2]);
		System.out.println("----");
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("----");
		b[0] = 12;
		b[1] = 34;
		b[2] = 56;
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		
	}

}
