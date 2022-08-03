package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.brad.utils.BCrypt;

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
	
	static boolean isDataRepeat(String account) throws Exception {
		checkStatement.setString(1, account);
		ResultSet rs = checkStatement.executeQuery();
		return rs.next();
	}
	
	static boolean appendData(String account, String passwd, String realname)
		throws Exception {
		appendStatement.setString(1, account);
		appendStatement.setString(2, BCrypt.hashpw(passwd, BCrypt.gensalt()));
		appendStatement.setString(3, realname);
		int n = appendStatement.executeUpdate();
		
		return n != 0;
	}

}
