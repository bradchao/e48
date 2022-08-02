package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc01 {

	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("OK");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.toString());
//		}
		
		try {
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit48?user=root&password=root");
			System.out.println("OK");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
