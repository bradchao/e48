package tw.brad.e48;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.utils.MyDrawer;

public class SignApp extends JFrame {
	private JButton clear, undo, redo;
	private MyDrawer myDrawer;
	
	public SignApp() {
		super("SignApp");
		
		setLayout(new BorderLayout());
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear); top.add(undo); top.add(redo);
		
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addEventListener();
	}
	
	private void addEventListener() {
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

	public static void main(String[] args) {
		new SignApp();
	}

}
