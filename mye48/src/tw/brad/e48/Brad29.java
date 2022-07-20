package tw.brad.e48;

public class Brad29 {
	public static void main(String[] args) {

	}
}

// public
interface Shape {
	double length();
	double area();
}
class Rec implements Shape {
	double w, h;
	Rec(int w, int h){this.w=w; this.h = h;}
	public double length() {return (w+h)*2;}
	public double area() { return w*h;}
}
class Tri implements Shape {
	double w1,w2,w3,h;
	public double length() {return w1+w2+w3;}
	public double area() {return w1*h/2;}
}
class Circle implements Shape {
	double r;
	public double length() {return 2*Math.PI*r;}
	public double area() {return Math.PI*r*r;}
}
