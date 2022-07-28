package tw.brad.e48;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	
	public Racing() {
		super("Racing Game");
		
		setLayout(new GridLayout(9,1));
		
		go = new JButton("Go!"); add(go);
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel((i+1) + ".");
			add(lanes[i]);
		}
		
		setSize(1024, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class Car extends Thread {
		private int lane;
		Car(int lane){
			this.lane = lane;
		}
		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				lanes[lane].setText(lanes[lane].getText() +  ">");
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Racing();
	}

}
