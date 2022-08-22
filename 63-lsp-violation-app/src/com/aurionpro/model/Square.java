package com.aurionpro.model;

public class Square implements Ishape {
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void calculateArea() {
		double area=side*side;
		System.out.println(area);
		
	}

	

}
