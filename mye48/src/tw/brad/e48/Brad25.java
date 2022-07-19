package tw.brad.e48;

public class Brad25 {
	public static void main(String[] args) {
		Brad253 obj1 = new Brad253();
	}
}

class Brad251 extends Object {
	Brad251(){
		System.out.println("Brad251()");
	}
}
class Brad252 extends Brad251 {
	Brad252(){
		System.out.println("Brad252()");
	}
	Brad252(int a){
		System.out.println("Brad252(int)");
	}
}
class Brad253 extends Brad252 {
	Brad253(){
		super(3);
		System.out.println("Brad253()");
	}
}





