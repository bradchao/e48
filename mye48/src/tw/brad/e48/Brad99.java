package tw.brad.e48;

public class Brad99 {

	public static void main(String[] args) {
		final int ROW = 1;
		final int START = 1;
		final int COL = 9;
		
		for (int k = 0; k < ROW; k++) {
			for (int j = 1; j<=9; j++) {
				for (int i = START; i < START + COL ; i++) {
					int newi = i + k*COL;
					int r = newi * j;
					System.out.printf("%d x %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println("----");
		}
	}

}
