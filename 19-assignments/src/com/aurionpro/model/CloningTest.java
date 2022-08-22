package com.aurionpro.model;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee("Rizwan", 101, 40000);
		emp.printStudentDetails();
		Employee empClone = (Employee) emp.clone();
		empClone.printStudentDetails();
		System.out.println(emp.hashCode());
		System.out.println(empClone.hashCode());
	}

}
