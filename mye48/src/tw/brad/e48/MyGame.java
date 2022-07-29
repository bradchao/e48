package tw.brad.e48;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

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
		private Timer timer;
		private boolean isInit;
		private int ballW, ballH;
		
		MyPanel(){
			setBackground(Color.yellow);
			timer = new Timer();
			try {
				ball1 = ImageIO.read(new File("dir1/ball1.png"));
				ball2 = ImageIO.read(new File("dir1/ball2.png"));

			}catch(Exception e){}
			
			timer.schedule(new RefreshTask(), 100, 16);	// FPS
		}
		
		private void init() {
			ballW  =ball1.getWidth();
			ballH = ball1.getHeight();
			isInit = true;
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			if (!isInit) {
				init();
			}
			
			
			Graphics2D g2d = (Graphics2D)g;
			//g2d.drawImage(ball1, ballX, ballY, null);
		}
		
		private class RefreshTask extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
	}
	public static void main(String[] args) {
		new MyGame();
	}
}

class Ball extends TimerTask {
	private int x, y, dx, dy;
	private int w, h;
	private int img;	// 1: ball1; 2: ball2
	private JPanel view;
	
	Ball(int x, int y, int w, int h, JPanel view){
		this.x = x; this.y = y; this.w = w; this.h = h;
		this.img = (int)(Math.random()*2)+1;
		dx = (int)(Math.random()*9)-4;
		dy = (int)(Math.random()*9)-4;
		this.view = view;
	}
	
	@Override
	public void run() {
		if (x + w > view.getWidth() || x < 0) {
			dx *= -1;
		}
		if (y + h > view.getHeight() || y < 0) {
			dy *= -1;
		}
		
		x += dx;
		y += dy;
	}
}


