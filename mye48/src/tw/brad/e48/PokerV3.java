package tw.brad.e48;

public class PokerV3 {

	public static void main(String[] args) {
		int nums = 52;
		int[] poker = new int[nums];	// index => int, > 0 
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = nums -1; i > 0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <-> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
//		for(int card : poker) {
//			System.out.println(card);
//		}
		
		System.out.println("------");
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		for(int[] player : players) {
			for (int card : player) {
				System.out.print(card + " ");
			}
			System.out.println();
		}
		
		
	}

}
