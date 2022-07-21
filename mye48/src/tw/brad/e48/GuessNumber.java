package tw.brad.e48;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumber extends JFrame implements ActionListener {
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;
	
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
		
		newGame();
	}
	public static void main(String[] args) {
		new GuessNumber();
	}
	
	public void actionPerformed(ActionEvent e) {
		counter++;
		String gus = input.getText();
		String result = checkAB(gus);
		log.append(counter + ". " + gus + " => " + result + "\n");
		input.setText("");
		
		if (result.equals("3A0B")) {
			// WINNER
			JOptionPane.showMessageDialog(null, "恭喜老爺,賀喜夫人");
		}else if (counter == 3) {
			// Loser
			JOptionPane.showMessageDialog(null, "輸了, ANSWER = " + answer);
		}
	}
	
	private String checkAB(String g) {
		int a, b; a = b = 0;
		for (int i=0; i<answer.length(); i++) {
			if (answer.charAt(i) == g.charAt(i)) {
				a++;
			}else if (answer.indexOf(g.charAt(i))>=0) {
				b++;
			}
		}
		return String.format("%dA%dB",a,b);
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
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<dig; i++) {
			sb.append(poker[i]);
		}
		answer = sb.toString();
		
	}

	
	private void newGame() {
		createAnswer(3);
		counter = 0;
		System.out.println(answer);
	}


}
