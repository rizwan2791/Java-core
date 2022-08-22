package com.aurionpro.model;

public class Circle {

	private double radius;
	private final colorType color;
	private final BorderType border;

	public double getRadius() {
		return radius;
	}

	public colorType getColor() {
		return color;
	}

	public BorderType getBorder() {
		return border;
	}

	public Circle(int rd, colorType c, BorderType b) {
		radius = rd;
		color = c;
		border = b;
	}

	public Circle(int rd, colorType c) {
		this(rd, c, BorderType.SOLID);
	}

	public Circle(int rd) {
		this(rd, colorType.GREEN, BorderType.DASHED);
	}

	public double calculateArea() {
		double area;
		return area = 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", border=" + border + "]";
	}
	

}