package com.aurionpro.model;

public class Player {
	private String name;
	private int age;
	private int id;
	private static int idCount=101;
	public Player(String name, int age) {
		this.name = name;
		this.age = age;
		this.id =getID();
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public int getID() {
		return idCount++;
	}
	
	public Player AgeGreater(Player obj2) {
		if(this.getAge() < obj2.getAge()) {
			return obj2;
		}
		return this;	
		
	}

}
