package tw.brad.e48;

public class PokerV1 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) {
			poker[i] = (int)(Math.random()*52);
			System.out.println(poker[i]);
		}
	}

}
