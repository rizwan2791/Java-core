package com.aurionpro.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Employee {
	String name;
	int id;
	LocalDate date;
	LocalTime time;

	public Employee(String name, int id, LocalDate date, LocalTime time) {
		super();
		this.name = name;
		this.id = id;
		this.date = date;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalTime getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Date=" + date + ", Time=" + time + "]";
	}

}