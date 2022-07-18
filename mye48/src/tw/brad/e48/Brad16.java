package tw.brad.e48;

public class Brad16 {

	public static void main(String[] args) {
		int[] a = {1,3,2,7,4,8};
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---");
		
		// for-each
		for (int v : a) {
			System.out.println(v);
		}
		
	}

}
