package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.brad.utils.BCrypt;
import tw.brad.utils.Member;

public class Jdbc09 {

	public static void main(String[] args) {
		String account = "brad2", passwd = "123456";
		
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit48", prop);) {
			Member member = login(account, passwd, conn);
			if (member != null) {
				System.out.println("Welcome, " + member.getRealname());
			}else {
				System.out.println("get out here");
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	static Member login(String account, String passwd, Connection conn) 
		throws Exception {
		String sql = "SELECT * FROM member WHERE account = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, account);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			String hashPasswd = rs.getString("passwd");
			if (BCrypt.checkpw(passwd, hashPasswd)) {
				Member member = new Member(rs.getInt("id"), 
						rs.getString("account"),
						rs.getString("realname"));
				return member;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}

}
