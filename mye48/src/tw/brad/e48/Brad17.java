package tw.brad.e48;

public class Brad17 {

	public static void main(String[] args) {
		int[][] a;
		a = new int[2][3];
		
		for(int[] v : a) {
			for (int vv : v) {
				System.out.print(vv + " ");
			}
			System.out.println();
		}
		
		int[][] b = new int[3][];
		b[0] = new int[2];
		b[1] = new int[3];
		b[2] = new int[4];
		System.out.println("---");
		for(int[] v : b) {
			for (int vv : v) {
				System.out.print(vv + " ");
			}
			System.out.println();
		}
		
	}

}
