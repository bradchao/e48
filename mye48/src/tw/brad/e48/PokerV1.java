package tw.brad.e48;

public class PokerV1 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		long start = System.currentTimeMillis();
		
		for (int i=0; i<poker.length; i++) {
			int temp = (int)(Math.random()*52);
			
			// 檢查機制
			boolean isRepeat = false;
			for (int j = 0; j < i; j++) {
				if (temp == poker[j]) {
					// 發生重複了
					isRepeat = true;
					break;
				}
			}
			
			if (!isRepeat) {
				poker[i] = temp;
				System.out.println(poker[i]);				
			}else {
				i--;
			}
			
		}
		System.out.println("---");
		System.out.println(System.currentTimeMillis() - start);
	}

}
