package tw.brad.utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	
	public MyDrawer() {
		setBackground(Color.yellow);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		if (g instanceof Graphics2D) {
//			System.out.println("OK");
//		}
		
		Graphics2D g2d = (Graphics2D)g;
		
	}
	
}
