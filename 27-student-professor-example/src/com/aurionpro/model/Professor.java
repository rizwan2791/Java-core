package com.aurionpro.model;

public class Professor extends Person implements ISalary {
	double basicSalray;
	public Professor(int id, String add, String dob,double basicSalray) {
		super(id, add, dob);
		this.basicSalray=basicSalray;
		
	}

	@Override
	public double calculateSalary() {
		double tSalary=0;
		tSalary=tSalary+(3*basicSalray);
		return tSalary;
	}
}
