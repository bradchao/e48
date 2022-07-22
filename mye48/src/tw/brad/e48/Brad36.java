package tw.brad.e48;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Brad36 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer ii = it.next();
			System.out.println(ii);
		}
		System.out.println("---");
		for(Integer ii : set) {
			System.out.println(ii);
		}
		
	}

}
