package tw.brad.utils;

import java.io.Serializable;

public class Bike implements Serializable{
	protected double speed;
	private int color;
	
	public Bike() {
		System.out.println("Bike()");
		color = 1;
	}
	public Bike(int newColor) {
		System.out.println("Bike()");
		color = newColor;
	}
	
	public int getColor() {return color;}
	
	public void upSpeed() {
		speed = speed < 1? 1 : speed * 1.4;
	}
	public void downSpeed() {
		speed = speed < 1? 0 : speed * 0.7;
	}
	public double getSpeed() {
		return speed;
	}
	
}
