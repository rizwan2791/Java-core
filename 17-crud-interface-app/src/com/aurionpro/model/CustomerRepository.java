package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Create Customer order");

	}

	@Override
	public void read() {
		System.out.println("Read Customer order");
	}

	@Override
	public void update() {
		System.out.println("Update Customer order");

	}

	@Override
	public void delete() {
		System.out.println("delete Customer order");

	}

}
