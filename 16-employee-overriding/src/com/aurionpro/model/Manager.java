package com.aurionpro.model;

public class Manager extends Employee {

	public double hra;
	public double da;
	public double ta;

	public Manager(int employeeNumber, String empName, double basicSalary) {
		super(employeeNumber, empName, basicSalary);

		this.hra = (basicSalary * 0.3);
		this.da = (basicSalary * 0.2);
		this.ta = (basicSalary * 0.1);

	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
	}

	@Override
	public double calculateAnnualCTC() {
		double basic = (basicSalary + hra + da + ta) * 12;
		return basic;

	}

	@Override
	public double getPa() {
		return 0;
	}

	@Override
	public double getOt() {
		return 0;
	}

	@Override
	public double getPerks() {
		return 0;
	}

}
