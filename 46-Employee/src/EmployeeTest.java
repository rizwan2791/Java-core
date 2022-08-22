import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, "RizwanSiddiqui", 20000));
		list.add(new Employee(101, "sarah", 10000));
		list.add(new Employee(101, "Sabah", 30000));
		Optional<Employee> min = list.stream().min(Comparator.comparingDouble(a->a.getSalary()));
		min.ifPresent(System.out::println);
		Optional<Employee> max = list.stream().max(Comparator.comparingDouble(a->a.getSalary()));
		max.ifPresent(System.out::println);
		list.stream()
			.filter(e->e.getName().length()>6)
			.forEach(System.out::println);
		System.out.println(list.stream()
				.mapToDouble(e->e.getSalary())
				.sum());
		
		

	}
}
