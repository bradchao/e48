package tw.brad.e48;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;

import org.json.JSONArray;
import org.json.JSONObject;

import tw.brad.utils.Souvenir;

public class Jdbc05 {

	public static void main(String[] args) {
		try {
			String json = fetchNetdata();
			LinkedList<Souvenir> datas = parseJSONData(json);
			
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

}
