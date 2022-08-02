package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc03 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit48", prop);
			
			Statement stmt = conn.createStatement();
//			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES " + 
//					"('test1','123','1999-01-02')," + 
//					"('test2','123','1999-01-02')," + 
//					"('test3','123','1999-01-02')," + 
//					"('test4','123','1999-01-02')";

//			String sql = "DELETE FROM cust WHERE id <= 5";
			
			String sql = "UPDATE cust SET cname='brad', tel ='321' WHERE id >= 7";
			
			int n = stmt.executeUpdate( sql);
			System.out.println(n);
			
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
