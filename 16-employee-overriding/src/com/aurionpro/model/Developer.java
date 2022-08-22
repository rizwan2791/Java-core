package com.aurionpro.model;

public class Developer extends Employee {

	public double pa;
	public double ot;

	public Developer(int employeeNumber, String empName, double basicSalary) {
		super(employeeNumber, empName, basicSalary);

		this.pa = (basicSalary * 0.3);
		this.ot = (basicSalary * 0.2);

	}
	public double getPa() {
		return pa;
	}

	public double getOt() {
		return ot;
	}
	@Override
	public double calculateAnnualCTC() {
		double ctc= (basicSalary + ot + pa) * 12;
		return ctc;

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
	public double getPerks() {
		return 0;
	}

}