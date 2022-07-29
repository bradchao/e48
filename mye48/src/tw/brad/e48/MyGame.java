package tw.brad.e48;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGame extends JFrame {
	private MyPanel myPanel;
	
	public MyGame() {
		super("");
	
		myPanel = new MyPanel();
		setLayout(new BorderLayout());
		add(myPanel, BorderLayout.CENTER);
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyPanel extends JPanel {
		private BufferedImage ball1, ball2;
		
		MyPanel(){
			setBackground(Color.yellow);
			try {
				ball1 = ImageIO.read(new File("dir1/ball1.png"));
				ball2 = ImageIO.read(new File("dir1/ball2.png"));
			}catch(Exception e){}
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			
			g2d.drawImage(ball1, 100, 100, null);
			
			
		}
	}
	

	public static void main(String[] args) {
		new MyGame();
	}

}
