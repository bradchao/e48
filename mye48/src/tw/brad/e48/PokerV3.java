package tw.brad.e48;

public class PokerV3 {

	public static void main(String[] args) {
		int nums = 10;
		int[] poker = new int[nums];	// index => int, > 0 
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = nums -1; i > 0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <-> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		for(int card : poker) {
			System.out.println(card);
		}
		
	}

}
