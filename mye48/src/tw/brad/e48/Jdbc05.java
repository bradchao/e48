package tw.brad.e48;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

import tw.brad.utils.Souvenir;

public class Jdbc05 {

	public static void main(String[] args) {
		try {
			String json = fetchNetdata();
			LinkedList<Souvenir> datas = parseJSONData(json);
			insertDB(datas);
			System.out.println("Finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	static String fetchNetdata() throws Exception{
		URL url = new URL(
			"https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvAgriculturalProduce.aspx");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.connect();
		BufferedReader reader = 
			new BufferedReader(
				new InputStreamReader(conn.getInputStream()));
		StringBuffer sb = new StringBuffer();
		String line;
		while ( (line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
		return sb.toString();
	}
	
	
	static LinkedList<Souvenir> parseJSONData(String json) throws Exception {
		LinkedList<Souvenir> datas = new LinkedList<>();
		try {
			
			JSONArray root = new JSONArray(json);
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);
				Souvenir souvenir = new Souvenir();
				souvenir.sname = row.getString("Name");
				souvenir.tel = row.getString("ContactTel");
				souvenir.lat = row.getDouble("Latitude");
				souvenir.lng = row.getDouble("Longitude");
				souvenir.picurl = row.getString("Column1");
				souvenir.addr = row.getString("SalePlace");
				datas.add(souvenir);
			}
			return datas;
		}catch(Exception e) {
			throw new Exception();
		}
	}
	
	
	static void insertDB(LinkedList<Souvenir> datas) throws Exception{
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/eeit48", prop);
		
		String sql = "INSERT INTO souvenir (sname,tel,lng,lat,picurl,addr) " + 
				"VALUES (?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		for (Souvenir souvenir : datas) {
			pstmt.setString(1, souvenir.sname);
			pstmt.setString(2, souvenir.tel);
			pstmt.setDouble(3, souvenir.lng);
			pstmt.setDouble(4, souvenir.lat);
			pstmt.setString(5, souvenir.picurl);
			pstmt.setString(6, souvenir.addr);
			pstmt.executeUpdate();
		}
			
	}

}
