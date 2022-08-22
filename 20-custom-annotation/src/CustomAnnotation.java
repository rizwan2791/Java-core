import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
	String os() default "Symbain";

	int version() default 1;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface DifferentSmartPhones {
}

@SmartPhone(os = "nokia", version = 7)
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
