package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Jdbc08 {
	static final String sqlCheckAccount = "SELECT account FROM member WHERE account = ?";
	static final String sqlAppendAccount = "INSERT INTO member (account,passwd,realname) VALUES (?,?,?)";
	static PreparedStatement checkStatement, appendStatement;

	public static void main(String[] args) {
		String accont = "brad", passwd = "123456", realname = "BradOK";
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit48", prop);) {
			checkStatement = conn.prepareStatement(sqlCheckAccount);
			appendStatement = conn.prepareStatement(sqlAppendAccount);
			if (!isDataRepeat(accont)) {
				if (appendData(accont, passwd, realname)) {
					System.out.println("Success");
				}else {
					System.out.println("E2");
				}
			}else {
				System.out.println("E1");
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}

		
	}
	
	static boolean isDataRepeat(String account) {
		return true;
	}
	
	static boolean appendData(String account, String passwd, String realname) {
		return true;
	}

}
