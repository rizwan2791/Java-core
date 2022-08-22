import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student(19, "Rizwan", GenderType.MALE),
				new Student(20, "Sarah", GenderType.FEMALE),
				new Student(22, "Kaif", GenderType.MALE),
				new Student(23, "Rizwan", GenderType.MALE)
						);

		System.out.println(list.stream()
			.collect(Collectors.groupingBy(Student::getName)));
			
	}
}
