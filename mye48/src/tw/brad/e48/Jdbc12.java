package tw.brad.e48;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Jdbc12 extends JFrame {
	private JTable jTable;
	private MyModel myModel;
	
	public Jdbc12() {
		super();
		
		setLayout(new BorderLayout());
		
		myModel = new MyModel();
		jTable = new JTable(myModel);
		add(jTable, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	private class MyModel extends DefaultTableModel {

		@Override
		public int getRowCount() {
			return 10;
		}

		@Override
		public int getColumnCount() {
			return 4;
		}

		@Override
		public String getColumnName(int column) {
			return "Field" + column;
		}

		@Override
		public Object getValueAt(int row, int column) {
			return "Brad" + row + "x" + column;
		}
		
	}
	
	public static void main(String[] args) {
		new Jdbc12();
	}

}
