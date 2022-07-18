package tw.brad.e48;

public class Brad15 {

	public static void main(String[] args) {
		int[] p = new int[6];	// p[0], ... p[5]
		
		for (int i=0; i<100000; i++) {
			int point = (int)(Math.random()*9);	// 0,1,2,3,4,5, 6,7,8
			p[point<6?point:point-3]++;
		}
		
		for (int i=0; i<p.length; i++) {
			System.out.printf("%d點出現%d次\n", (i+1), p[i]);
		}
		
	}

}
