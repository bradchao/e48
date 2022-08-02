package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc02 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/", prop);
			
			Statement stmt = conn.createStatement();
			stmt.execute("CREATE DATABASE brad");
			stmt.execute("USE brad");
			stmt.execute("CREATE TABLE t1 (f1 VARCHAR(4),f2 VARCHAR(4))");
			
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
