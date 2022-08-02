package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {

	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("OK");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.toString());
//		}
		
		try {
//			Connection conn = DriverManager.getConnection(
//				"jdbc:mysql://localhost:3306/eeit48?user=root&password=root");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/eeit48","root","root");

			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit48", prop);
			
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(
				"INSERT INTO cust (cname,tel,birthday) VALUES ('brad','123','1999-01-02')");
			
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
