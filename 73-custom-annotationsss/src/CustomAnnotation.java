import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface DifferentSmartPhones {
}

@SmartPhone
public class CustomAnnotation {

	@DifferentSmartPhones
	public void iphone() {

	}

	@DifferentSmartPhones
	public void nokia() {

	}

	@DifferentSmartPhones
	public void samsung() {

	}

	@DifferentSmartPhones
	public void onePlus() {

	}

}
