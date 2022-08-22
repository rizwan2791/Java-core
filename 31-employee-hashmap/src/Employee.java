
public class Employee {
	int id;
	double salary;
	String name;
	public Employee(int id, double salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
