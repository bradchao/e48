package tw.brad.e48;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	
	public GuessNumber() {
		super("猜數字遊戲");
		
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		add(log, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		
		guess.addActionListener(this);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GuessNumber();
	}
	
	public void actionPerformed(ActionEvent e) {
		//System.out.println("OK");
		createAnswer(4);
		System.out.println(answer);
	}
	
	private void createAnswer(int dig) {
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
		
		answer = "" + poker[0] + poker[1] + poker[2];
		
	}

}
