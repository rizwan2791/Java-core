package com.aurionpro.model;

public class Student extends Person{
	public BranchType branch;
	public Student(int id, String add, String dob,BranchType branch) {
		super(id, add, dob);
		this.branch=branch;
	}
	
	public BranchType getBranch() {
		return branch;
	}

	public void setBranch(BranchType branch) {
		this.branch = branch;
	}

}
