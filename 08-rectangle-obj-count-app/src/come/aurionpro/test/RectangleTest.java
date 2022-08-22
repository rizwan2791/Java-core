package come.aurionpro.test;
import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle[] rec= {
				new Rectangle(10, 20, colorType.GREEN),
				new Rectangle(10, 20, colorType.GREEN),
				new Rectangle(10, 20, colorType.GREEN),
				new Rectangle(10, 20, colorType.GREEN),
				new Rectangle(10, 20),		
		};
		System.out.println("Object count  : "+Rectangle.count);
	}
}