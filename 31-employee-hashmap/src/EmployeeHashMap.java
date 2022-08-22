
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeHashMap {

	public static void main(String[] args) {

		Employee[] employees = { new Employee(1, 13000, "Sarah"), new Employee(1, 134000, "Sabah"),
				new Employee(1, 24000, "Shani"), };

		HashMap<Integer, Employee> empHash = new HashMap<>();

		for (Employee emp : employees) {
			empHash.put(emp.getId(), emp);
		}
		Set<Map.Entry<Integer, Employee>> val = empHash.entrySet();
		for (Map.Entry<Integer, Employee> e : val) {
			System.out.println(e.getKey() + " : " + e.getValue());

		}
	}
}