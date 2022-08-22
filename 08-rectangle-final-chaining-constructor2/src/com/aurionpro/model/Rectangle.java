package com.aurionpro.model;

public class Rectangle {

	private  int height;
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public colorType getColor() {
		return color;
	}

	private  int width;
	private colorType color;

	public Rectangle(int ht, int wt, colorType c) {
		height = validate(ht);
		width = validate(wt);
		color = c;
	}
	public Rectangle(int ht, int wt ) {
		this(ht,wt,colorType.RED);
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