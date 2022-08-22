package come.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle[] circles = {new Circle(10, colorType.BLUE, BorderType.DOTTED), 
							new Circle(33, colorType.RED),
							new Circle(55),
							};
		for (Circle r : circles)
		printCircleInfo(r);
//		System.out.println(r.toString() ; 
	}

	private static void printCircleInfo(Circle circle) {
		System.out.println("Radius : " + circle.getRadius());
		System.out.println("Area of Circle : " + circle.calculateArea());
		System.out.println("Colour : "+circle.getColor());
		System.out.println("Border : " + circle.getBorder());
		System.out.println("-------------------------------");
	}
}
