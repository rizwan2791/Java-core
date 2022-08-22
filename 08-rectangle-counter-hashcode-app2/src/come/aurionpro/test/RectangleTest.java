package come.aurionpro.test;
import com.aurionpro.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(100, 90,"Blue");
		Rectangle recOne = new Rectangle(100, 90,"Blue");
		System.out.println(rec.equals(recOne));
		System.out.println(rec.hashCode());
		System.out.println(recOne.hashCode());

	}
}