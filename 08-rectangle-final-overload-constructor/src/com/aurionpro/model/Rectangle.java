package com.aurionpro.model;

public class Rectangle {

	private  int height;
	private  int width;
	private colorType color;
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public colorType getColor() {
		return color;
	}



	public Rectangle(int ht, int wt, colorType c) {
		height = ht;
		width = wt;
		color = c;
	}
	public Rectangle(int ht, int wt ) {
		this(ht,wt,colorType.RED);
	}
	public Rectangle(int ht ) {
		this(ht,10,colorType.RED);
	}


	


//	private String validateColor(String c) {
//		if (c.toLowerCase().equals("green")) {
//			return "green";
//		}
//		if (c.toLowerCase().equals("blue")) {
//			return "blue";
//		}
//		return "red";
//	}
	// toignoreCase

	private int validate(int hm) {
		if (hm <= 0) {
			return 1;
		}
		if (hm > 100) {
			return 100;
		} else
			return hm;
	}

	public int calculateArea() {
		int area;
		return area = height * width;
	}

}