package tw.brad.e48;

public class Brad40 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLegs(1);
		} catch (Exception e) {
			System.out.println("xxxxx");
		}
		System.out.println(b1.getLegs());
	}

}
class Bird {
	private int legs;
	Bird(){
		legs = 2;
	}
	void setLegs(int legs) throws Exception {
		if (legs<0 || legs>2) {
			throw new Exception();
		}
		this.legs = legs;
	}
	int getLegs() {
		return legs;
	}
}