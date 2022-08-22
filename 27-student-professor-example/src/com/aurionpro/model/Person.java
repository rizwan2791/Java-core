package com.aurionpro.model;

public class Person {
	private int id;
	private String add;
	private String dob;
	public Person(int id, String add, String dob) {
		super();
		this.id = id;
		this.add = add;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public String getAdd() {
		return add;
	}
	public String getDob() {
		return dob;
	}
	
	

}
