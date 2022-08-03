package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Jdbc09 {

	public static void main(String[] args) {
		String account = "brad", passwd = "123456";
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit48", prop);) {
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	static void login(String account, String passwd, Connection conn) 
		throws Exception {
		String sql = "SELECT * FROM member WHERE account = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, account);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			
		}else {
			
		}
	}

}
