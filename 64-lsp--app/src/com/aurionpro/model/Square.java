package com.aurionpro.model;

public class Square extends Rectangle {
//	private double side;
	public Square(double side) {
		super(side, side);
		
	}

	@Override
	public void setHeight(double height) {	
		super.setHeight(height);
		super.setWidth(height);
	}

	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		super.setWidth(width);
	}

	
	

}
