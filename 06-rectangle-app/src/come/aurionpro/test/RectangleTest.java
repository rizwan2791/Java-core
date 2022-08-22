package come.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.colorType;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(-1, 20, colorType.BLUE);
		printRectangleInfo(rec);
		System.out.println("------------");
		Rectangle bigrec = new Rectangle(1000, 50,colorType.GREEN);
		printRectangleInfo(bigrec);
	}

	private static void printRectangleInfo(Rectangle rectangle) {
		System.out.println("Colour : " + rectangle.setColor());
		System.out.println("Height : " + rectangle.setHeight());
		System.out.println("Width : " + rectangle.setWidth());
		System.out.println("Area of rectangle " + rectangle.calculateArea());

	}
}