package tw.brad.e48;

import tw.brad.utils.BCrypt;

public class Brad69 {

	public static void main(String[] args) {
		String passwd = "123456";
		String passwd2 = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(passwd2);
	}

}
