package tw.brad.e48;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad23 extends JFrame{
	private JButton b1, b2, b3;
	
	public Brad23() {
		super("我的視窗程式");
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad23();
	}

}
