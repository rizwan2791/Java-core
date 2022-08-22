package com.aurionpro.model;

public abstract class Employee {

	public int employeeNumber;
	public String empName;
	public double basicSalary;

	public Employee(int employeeNumber, String empName, double basicSalary) {
		this.employeeNumber = employeeNumber;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public abstract double calculateAnnualCTC();

	public abstract double getHra();

	public abstract double getDa();

	public abstract double getTa();

	public abstract double getPa();

	public abstract double getOt();

	public abstract double getPerks();
	



}