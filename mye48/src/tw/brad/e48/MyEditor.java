package tw.brad.e48;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
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
		
		processEvent();
	}
	
	private void processEvent() {
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
	}

	private void openFile() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			System.out.println(file.getAbsolutePath());
		}
	}
	
	public static void main(String[] args) {
		new MyEditor();
	}

}
