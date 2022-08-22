package com.aurionpro.model;
import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {

		ArrayList<Product> items = new ArrayList<>();
		items.add(new Product("101", "Maggi", 100, 10, 5));
		items.add(new Product("102", "Biscuit", 100, 5, 10));
		Invoice invoice = new Invoice(items);
		invoice.displayAllBills();

	}

}
