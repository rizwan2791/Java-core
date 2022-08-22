
public class Student {
	private int age;
	private String name;
	private GenderType gender;

	public Student(int age, String name, GenderType gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public GenderType getGender() {
		return gender;
	}

}
