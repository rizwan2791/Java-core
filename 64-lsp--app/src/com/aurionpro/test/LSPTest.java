package com.aurionpro.test;
import com.aurionpro.model.*;
public class LSPTest {

	public static void main(String[] args) {
		Rectangle rec=new Rectangle(10, 20);
		if(isRectangle(rec)) {
			System.out.println("Is a rectangle");
		}else {
			System.out.println("Not a rectangle");
		}
		System.out.println("---------------------------");

		Square sq=new Square(10);
		if(isRectangle(sq)) {
			System.out.println("Is a rectangle");
		}else {
			System.out.println("Not a rectangle");
		}
		

	}
	public static boolean isRectangle(Rectangle recobj) {
		double prev=recobj.getWidth();
		recobj.setHeight(50);
		double after=recobj.getWidth();		
		return prev==after;
	}

}
