package tw.brad.e48;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private int rank;
	
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
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
	}
	
	private void go() {
		go.setEnabled(false);
		rank = 0;
		for (int i=0; i<lanes.length; i++) {
			lanes[i].setText((i+1) + ".");
		}
		for (int i=0; i<cars.length; i++) {
			cars[i] = new Car(i);
		}
		
		for (int i=0; i<cars.length; i++) {
			cars[i].start();
		}
	}
	
	private class Car extends Thread {
		private int lane;
		Car(int lane){
			this.lane = lane;
		}
		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				if (i == 99) {
					lanes[lane].setText(lanes[lane].getText() +  ">" + ++rank);
				}else {
					lanes[lane].setText(lanes[lane].getText() +  ">");
				}
				if (rank == 8) go.setEnabled(true);
				try {
					Thread.sleep(10 + (int)(Math.random()*100));
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Racing();
	}

}
