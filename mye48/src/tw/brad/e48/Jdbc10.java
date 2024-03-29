package tw.brad.e48;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.brad.utils.BCrypt;
import tw.brad.utils.Member;
import tw.brad.utils.Student;

public class Jdbc10 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit48", prop);) {
			
			Student s1 = new Student(20, 30, 40, "brad");
			FileInputStream fin = new FileInputStream("dir1/ball1.png");
			
			String sql = "UPDATE member SET icon  = ?, student = ? WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setBinaryStream(1, fin);
			ps.setObject(2, s1);
			ps.setInt(3, 1);
			int n = ps.executeUpdate();
			System.out.println(n);
			fin.close();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
}
