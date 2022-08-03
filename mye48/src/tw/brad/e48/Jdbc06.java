package tw.brad.e48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc06 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/eeit48", prop);
			
			String sql = "SELECT * FROM souvenir";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String id = rs.getString("id");
				String sname = rs.getString("sname");
				String tel = rs.getString("tel");
				String lat = rs.getString("lat");
				String lng = rs.getString("lng");
				System.out.println(String.format("%s:%s:%s:%s:%s", id,sname,tel,lat,lng));
			}


		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}

}
