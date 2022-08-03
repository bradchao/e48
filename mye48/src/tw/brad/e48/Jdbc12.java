package tw.brad.e48;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Jdbc12 extends JFrame {
	private JTable jTable;
	private MyModel myModel;
	private int rows;
	private ResultSet dataSet;
	
	public Jdbc12() {
		super();
		
		setLayout(new BorderLayout());
		
		initDB();
		
		myModel = new MyModel();
		jTable = new JTable(myModel);
		JScrollPane jsp = new JScrollPane(jTable);
		add(jsp, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initDB() {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit48", prop);
			String sqlCount = "SELECT count(*) total FROM souvenir";
			PreparedStatement ps = conn.prepareStatement(sqlCount);
			ResultSet rs = ps.executeQuery();
			rs.next();
			rows = rs.getInt("total");
			
			String sqlQuery = "SELECT * FROM souvenir";
			PreparedStatement ps2 = conn.prepareStatement(sqlQuery,
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			dataSet = ps2.executeQuery();
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private class MyModel extends DefaultTableModel {

		@Override
		public int getRowCount() {
			return rows;
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
			String ret = "";
			try {
				dataSet.absolute(row+1);
				ret = dataSet.getString(column + 1);
			} catch (SQLException e) {
				System.out.println(e.toString());
				ret = "***";
			}
			return ret;
		}
		
	}
	
	public static void main(String[] args) {
		new Jdbc12();
	}

}
