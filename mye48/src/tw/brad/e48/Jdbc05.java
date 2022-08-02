package tw.brad.e48;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Jdbc05 {

	public static void main(String[] args) {
		try {
			String json = fetchNetdata();
			
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

}
