package tw.brad.e48;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyEditor extends JFrame {
	private JButton open, save, saveas;
	private JTextArea editor;
	
	public MyEditor() {
		super("文字編輯器");
		
		open = new JButton("Open...");
		save = new JButton("Save");
		saveas = new JButton("Save as...");
		editor = new JTextArea();
		
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(open); top.add(save);top.add(saveas);
		
		add(top, BorderLayout.NORTH);
		add(editor, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyEditor();
	}

}
