package com.aurionpro.model;

public class Rectangle implements ICalculateArea {
	int length;
	int breadth;
	

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	

	public int getLength() {
		return length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void calculateArea() {
		System.out.println(length*breadth);
		
	}

}
