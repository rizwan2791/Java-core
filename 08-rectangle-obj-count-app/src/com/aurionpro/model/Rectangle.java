package com.aurionpro.model;
public class Rectangle {
	private float width;
	private float height;
	private colorType color;
	public static int count;
	public Rectangle(float width, float height, colorType color) {
		this.width = width;
		this.height = height;
		this.color = color;
		count++;
	}
	public Rectangle(float width, float height) {
		this(width,height,colorType.BLUE);
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setColor(colorType color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}
	

}