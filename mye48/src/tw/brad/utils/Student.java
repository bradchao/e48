package tw.brad.utils;

import java.io.Serializable;

public class Student implements Serializable {
	private int ch, math, eng;
	private String name;
	public Student(int ch, int math, int eng, String name) {
		this.ch = ch;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
	public int score () {return ch + eng + math;}
	public double avg() {return score()/3.0;}
}
