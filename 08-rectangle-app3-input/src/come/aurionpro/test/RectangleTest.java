package come.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.colorType;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rectangles : ");
		int n = sc.nextInt();
		Rectangle[] rectangles = new Rectangle[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Height");
			int h = sc.nextInt();
			System.out.println("Enter Width");
			int w = sc.nextInt();
			System.out.println("Enter Color");
			colorType color;
			try {
				color = colorType.valueOf(sc.next().toUpperCase());
			} catch (IllegalArgumentException e) {
				color = colorType.RED;
			}

			rectangles[i] = new Rectangle(h, w, color);

		}

		for (Rectangle r : rectangles)
			printRectangleInfo(r);
	}

	private static void printRectangleInfo(Rectangle rectangle) {
		System.out.println("Colour : " + rectangle.getColor());
		System.out.println("Height : " + rectangle.getHeight());
		System.out.println("Width : " + rectangle.getWidth());
		System.out.println("Area of rectangle " + rectangle.calculateArea());
		System.out.println("------------------");
	}
}
