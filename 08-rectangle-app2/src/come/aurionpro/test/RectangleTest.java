package come.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.colorType;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle[] rectangles = { 
				new Rectangle(-1, 20, colorType.BLUE),
				new Rectangle(2, 20, colorType.GREEN),
				new Rectangle(55, 20, colorType.BLUE),
				new Rectangle(100, 20, colorType.BLUE),
				new Rectangle(90, 20, colorType.BLUE),
		};
	   for(Rectangle r:rectangles)
		   printRectangleInfo(r);
		}


	private static void printRectangleInfo(Rectangle rectangle) {
		System.out.println("Colour : " + rectangle.setColor());
		System.out.println("Height : " + rectangle.setHeight());
		System.out.println("Width : " + rectangle.setWidth());
		System.out.println("Area of rectangle " + rectangle.calculateArea());
		System.out.println("------------------");
	}
}
// Rectangle = new Rectangle(-1, 20, colorType.BLUE);
//printRectangleInfo(rec);
//System.out.println("------------");
//Rectangle bigrec = new Rectangle(1000, 50,colorType.GREEN);
//printRectangleInfo(bigrec);