package tw.brad.e48;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad65 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.ispan.com,tw");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//			if (conn instanceof HttpURLConnection) {
//				System.out.println("OK");
//			}
			InputStream in =  conn.getInputStream();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
