package tw.brad.e48;

import javax.swing.JFrame;

public class SignApp extends JFrame{
	
	public SignApp() {
		super("簽名App");
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SignApp();
	}

}
