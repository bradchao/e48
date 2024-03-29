package tw.brad.e48;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEditor extends JFrame {
	private JButton open, save, saveas;
	private JTextArea editor;
	private File openFile = null;
	
	public MyEditor() {
		super("文字編輯器");
		
		open = new JButton("Open...");
		save = new JButton("Save");
		saveas = new JButton("Save as...");
		editor = new JTextArea();
		
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(open); top.add(save);top.add(saveas);
		
		JScrollPane jsp = new JScrollPane(editor);
		
		add(top, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
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
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					saveFile();
					JOptionPane.showMessageDialog(null, "Save OK");
				} catch (Exception e1) {
					System.out.println(e1.toString());
				}
			}
		});
		
		saveas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					saveAsFile();
					JOptionPane.showMessageDialog(null, "Save OK");
				} catch (Exception e1) {
					System.out.println(e1.toString());
				}
			}
		});
	}

	private void openFile() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			openFile = jfc.getSelectedFile();
			try {
				readFile();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
	
	private void readFile() throws Exception {
		FileReader reader = new FileReader(openFile);
		long size = openFile.length();
		char[] buf = new char[(int)size];
		reader.read(buf);
		reader.close();
		
		editor.setText(new String(buf));
	}
	
	private void saveFile() throws FileNotFoundException, IOException {
		if (openFile != null) {
			FileWriter writer = new FileWriter(openFile);
			writer.write(editor.getText());
			writer.flush();
			writer.close();
		}
	}
	
	private void saveAsFile() throws Exception {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			File saveAsFile = jfc.getSelectedFile();
			FileWriter writer = new FileWriter(saveAsFile);
			writer.write(editor.getText());
			writer.flush();
			writer.close();
			openFile = saveAsFile;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		new MyEditor();
	}

}
