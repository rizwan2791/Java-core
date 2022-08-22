import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CustomAnnotationTest {

	public static void main(String[] args) {
		CustomAnnotation obj = new CustomAnnotation();
		Class cl = obj.getClass();
		for (Method method : cl.getDeclaredMethods()) {
			if (method.isAnnotationPresent(DifferentSmartPhones.class)) {
				System.out.println(method.getName());
			}
		}
	}
}
