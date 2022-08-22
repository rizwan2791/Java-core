
package com.aurionpro.model;

public class Rectangle {
	private int width;
	private int height;
	private String color;

	public Rectangle(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

	
	


}