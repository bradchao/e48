package tw.brad.e48;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import tw.brad.utils.BCrypt;
import tw.brad.utils.Member;
import tw.brad.utils.Student;

public class Jdbc11 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try(Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit48", prop);) {
			
			String sql = "SELECT * FROM member WHERE id = 1";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.next();
			
			FileOutputStream fout = new FileOutputStream("dir2/ball1.png");
			InputStream in = rs.getBinaryStream("icon");
			byte[] buf = new byte[1024];
			int len;
			while ( (len = in.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			System.out.println("OK1");
			
//			Object obj = rs.getObject("student");
//			if (obj instanceof Student) {
//				System.out.println("OK2");
//			}
			//System.out.println(obj.score() + ":" + obj.avg());
			
			InputStream in2 = rs.getBinaryStream("student");
			ObjectInputStream oin = new ObjectInputStream(in2);
			Object obj2 = oin.readObject();
			if (obj2 instanceof Student) {
				Student s1 = (Student)obj2;
				System.out.println(s1.score() + ":" + s1.avg());
			}
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
}
