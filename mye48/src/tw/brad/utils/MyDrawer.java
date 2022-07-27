package tw.brad.utils;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycler;
	
	public MyDrawer() {
		setBackground(Color.yellow);
		
		MyMouseListener listener = new MyMouseListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		lines = new LinkedList<>();
		recycler = new LinkedList<>();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setStroke(new BasicStroke(4));
		g2d.setColor(Color.BLUE);
		
		for (LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i=1; i<line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i-1);
				HashMap<String, Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), 
						p1.get("x"), p1.get("y"));
			}			
		}
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);
			
			lines.add(line);
			
			recycler.clear();
		}
		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			lines.getLast().add(point);
			
			repaint();
		}
	}

	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size() > 0) {
			recycler.add(lines.removeLast());
			repaint();
		}
	}
	
	public void redo() {
		if (recycler.size() > 0) {
			lines.add(recycler.removeLast());
			repaint();
		}
	}
	
	public void saveJPEG() {
		BufferedImage img = 
			new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = img.createGraphics();
		paint(g2d);
		
		try {
			ImageIO.write(img, "jpeg", new File("dir1/brad.jpg"));
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		
	}
	
	public void saveLines() {
		try(FileOutputStream fout = new FileOutputStream("dir1/lines.sign");
				ObjectOutputStream oout = new ObjectOutputStream(fout)
					) {
				oout.writeObject(lines);
				oout.flush();
				System.out.println("OK");
			} catch (Exception e) {
			}
	}
	
	public void loadLines() {
		try(ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/lines.sign"))){
			lines = (LinkedList<LinkedList<HashMap<String, Integer>>>)oin.readObject();
			repaint();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
}

