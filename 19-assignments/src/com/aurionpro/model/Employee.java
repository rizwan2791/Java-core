package com.aurionpro.model;

public class Employee  implements Cloneable{
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void printStudentDetails() {
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Salary : "+salary);
		
	}
	public Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }

}