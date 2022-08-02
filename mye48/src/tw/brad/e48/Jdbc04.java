package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc04 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit48", prop);
			
			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "brad");
			pstmt.setString(2, "112233");
			pstmt.setString(3, "1999-02-03");
			int n = pstmt.executeUpdate();
			System.out.println(n);
			
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
