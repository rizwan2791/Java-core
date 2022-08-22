package com.aurionpro.model;

public class Accountant extends Employee {

	public double perks;

	public Accountant(int employeeNumber, String empName, double basicSalary) {
		super(employeeNumber, empName, basicSalary);
		this.perks = (basicSalary * 0.5);
	}

	public double getPerks() {
		return perks;
	}

	@Override
	public double calculateAnnualCTC() {
		double sal=(basicSalary + perks) * 12;
		return sal;
	}
	
	@Override
	public double getHra() {
		return 0;
	}

	@Override
	public double getDa() {	
		return 0;
	}

	@Override
	public double getTa() {
		return 0;
	}

	@Override
	public double getPa() {
		return 0;
	}

	@Override
	public double getOt() {
		return 0;
	}


}