package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Create order");

	}

	@Override
	public void read() {
		System.out.println("Read order");
	}

	@Override
	public void update() {
		System.out.println("Update order");

	}

	@Override
	public void delete() {
		System.out.println("delete order");

	}

}
