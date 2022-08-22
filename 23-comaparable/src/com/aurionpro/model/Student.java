package com.aurionpro.model;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int salary;
	public Student(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.id == o.id)
			return 0;
		else if (this.id > o.id)
			return 1;
		return -1;
	}


}
