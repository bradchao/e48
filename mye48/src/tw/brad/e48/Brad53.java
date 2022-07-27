package tw.brad.e48;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import tw.brad.utils.Bike;

public class Brad53 {
	public static void main(String[] args) {
		Student s1 = new Student("Brad", 70, 80, 20);
		System.out.println(s1.getName() + ":" + s1.sum() + ":" +s1.avg());
		s1.getBike().upSpeed();
		s1.getBike().upSpeed();
		s1.getBike().upSpeed();
		s1.getBike().upSpeed();
		System.out.println(s1.getBike().getSpeed());
		
		try(FileOutputStream fout = new FileOutputStream("dir1/score1.brad");
			ObjectOutputStream oout = new ObjectOutputStream(fout)
				) {
			oout.writeObject(s1);
			oout.flush();
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

class Student implements Serializable{
	private String name;
	private int ch, eng, math;
	private Bike bike;
	
	public Student(String name, int ch, int eng, int math) {
		this.name = name; this.ch = ch;
		this.eng = eng; this.math = math;
		bike = new Bike();
	}
	public Bike getBike() {
		return bike;
	}
	public int sum() {
		return ch + eng + math;
	}
	public double avg() {
		return sum() / 3.0;
	}
	public String getName() {
		return name;
	}
}
