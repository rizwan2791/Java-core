package com.aurionpro.model;

public class Circle  implements ICalculateArea{
	int radius;
	double pi=3.142;
	public int getRadius() {
		return radius;
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void calculateArea() {
		System.out.println(pi*radius*radius);
		
	}

}
