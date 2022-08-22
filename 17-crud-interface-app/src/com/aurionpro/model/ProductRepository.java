package com.aurionpro.model;

public class ProductRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Create Product order");

	}

	@Override
	public void read() {
		System.out.println("Read  Product order");
	}

	@Override
	public void update() {
		System.out.println("Update  Product order");

	}

	@Override
	public void delete() {
		System.out.println("delete  Product order");

	}

}
