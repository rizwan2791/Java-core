package com.aurionpro.model;

public class Rectangle implements Ishape{
	private double height;
	private double width;
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	@Override
	public void calculateArea() {
		double area=height*width;
		System.out.println(area);
		
	}
	

}