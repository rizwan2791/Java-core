package come.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.colorType;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(-1, 20, colorType.BLUE);
		printRectangleInfo(rec);
		System.out.println("------------");
		Rectangle bigrec = new Rectangle(1000, 50);
		printRectangleInfo(bigrec);
		System.out.println("------------");
		Rectangle bigrecTwo = new Rectangle(1000);
		printRectangleInfo(bigrecTwo);
	}

	private static void printRectangleInfo(Rectangle rectangle) {
		System.out.println("Colour : " + rectangle.getColor());
		System.out.println("Height : " + rectangle.getHeight());
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Area of rectangle " + rectangle.calculateArea());
		System.out.println("------------------");
	}
}
// Rectangle = new Rectangle(-1, 20, colorType.BLUE);
//printRectangleInfo(rec);
//System.out.println("------------");
//Rectangle bigrec = new Rectangle(1000, 50,colorType.GREEN);
//printRectangleInfo(bigrec);