package tw.brad.e48;

public class Brad56 {
	public static void main(String[] args) {
		Brad561 b1 = new Brad561("A");
		Brad561 b2 = new Brad561("B");
		b1.start();
		b2.start();
		System.out.println("Brad");
	}
}

class Brad561 extends Thread {
	private String name;
	Brad561(String name){this.name = name;}
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
}
