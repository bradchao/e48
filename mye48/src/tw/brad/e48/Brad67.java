package tw.brad.e48;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad67 {

	public static void main(String[] args) {
		String host = "www.gamer.com.tw";
		String myurl = "http://" + host;
		try {
			URL url = new URL("https://pdfmyurl.com/?url=" + myurl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			try (BufferedOutputStream bout = 
					new BufferedOutputStream(
						new FileOutputStream("dir1/" + host + ".pdf"));
				BufferedInputStream bin = 
					new BufferedInputStream(conn.getInputStream());
					){
				
				byte[] buf = new byte[1024*1024];
				int len;
				while ( (len = bin.read(buf)) != -1) {
					bout.write(buf, 0, len);
				}
				bout.flush();
				System.out.println("Download OK");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
