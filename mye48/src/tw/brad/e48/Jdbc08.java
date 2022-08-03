package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Jdbc08 {

	public static void main(String[] args) {
		String accont = "brad", passwd = "123456", realname = "BradOK";
		String sqlCheckAccount = "SELECT account FROM member WHERE account = ?";
		String sqlAppendAccount = "INSERT INTO member (account,passwd,realname) VALUES (?,?,?)";
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit48", prop);) {
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}

		
	}

}
