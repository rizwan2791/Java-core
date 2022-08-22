import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class CustomAnnotationTest {

	public static void main(String[] args) {
//		List<Method> methods = new ArrayList<Method>();
		CustomAnnotation obj = new CustomAnnotation();
		Class c = obj.getClass();
		Annotation a = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone) a;
		System.out.println(s.os());
		System.out.println(s.version());
		Class cl = obj.getClass();
		for (Method method : cl.getDeclaredMethods()) {
			if (method.isAnnotationPresent(DifferentSmartPhones.class)) {
				System.out.println(method.getName());
//				methods.add(method);
			}

		}
//		for (Method m : methods) {
//			System.out.println(m.getName());
//		}
	}

}
