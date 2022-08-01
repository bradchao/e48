package tw.brad.e48;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad65 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.nhi.gov.tw/resource/Nhi_Fst/Fstdata.csv");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//			if (conn instanceof HttpURLConnection) {
//				System.out.println("OK");
//			}
			
			BufferedReader reader = 
				new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line; int i = 1;
			while ( (line = reader.readLine()) != null) {
				System.out.println(i++ + line);
			}
			reader.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
