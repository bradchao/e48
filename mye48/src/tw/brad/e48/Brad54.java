package tw.brad.e48;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad54 {

	public static void main(String[] args) {
		try(ObjectInputStream oin = 
				new ObjectInputStream(
					new FileInputStream("dir1/score1.brad"))){
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			System.out.println(s1.getName() + ":" + s1.sum() + ":" +s1.avg());
	
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
