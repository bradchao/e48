package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Jdbc07 {

	public static void main(String[] args) {
		System.out.print("Page = ");
		Scanner scanner = new Scanner(System.in);
		int page = scanner.nextInt();
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit48", prop);
			
			String sql = "SELECT count(*) nums FROM souvenir";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int nums = rs.getInt("nums");
			//System.out.println(nums);
			
			int rpp = 10;
			int start = (page - 1)*rpp;
			sql = String.format("SELECT * FROM souvenir WHERE addr like '澎湖%%' ORDER BY addr LIMIT %d, %d", start,rpp);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String sname = rs.getString("sname");
				String addr = rs.getString("addr");
				System.out.println(String.format("%s:%s:%s", id,sname,addr));
			}

		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

}
