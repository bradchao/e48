package tw.brad.e48;

public class PokerV2 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		long start = System.currentTimeMillis();
		
		boolean isRepeat;
		int temp;
		for (int i=0; i<poker.length; i++) {
			do {
				temp = (int)(Math.random()*52);
				
				// 檢查機制
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						// 發生重複了
						isRepeat = true;
						break;
					}
				}
				
			}while (isRepeat);
			
			poker[i] = temp;
			System.out.println(poker[i]);				
			
		}
		System.out.println("---");
		System.out.println(System.currentTimeMillis() - start);
	}

}
