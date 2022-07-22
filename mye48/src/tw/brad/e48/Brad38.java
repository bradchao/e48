package tw.brad.e48;

import java.util.HashMap;
import java.util.Set;

public class Brad38 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "Brad");
		map.put("gender", "male");
		map.put("weight", "80");
		//System.out.println(map.get("name"));
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " => " + map.get(key));
		}
		
	}

}
