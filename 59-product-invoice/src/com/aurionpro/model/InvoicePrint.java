package com.aurionpro.model;
import java.util.ArrayList;
public class InvoicePrint {
	public ArrayList<Double> taxes;
	public ArrayList<Double> discount;
	public ArrayList<Double> allPrices;
	public ArrayList<Product> products;
	public double totalCost;
	public InvoicePrint(ArrayList<Double> taxes, ArrayList<Double> discount, ArrayList<Double> allPrices,
			ArrayList<Product> products, double totalCost) {
		this.taxes = taxes;
		this.discount = discount;
		this.allPrices = allPrices;
		this.products = products;
		this.totalCost = totalCost;
	}

	public void printDetails() {
		System.out.println("PRODUCT INVOICE");
		for (int i = 0; i < products.size(); i++) {
			System.out.println("Product id : " + products.get(i).getId());
			System.out.println("Product Descrp : " + products.get(i).getDescription());
			System.out.println("Product Amount : " + products.get(i).getAmount());
			System.out.println("Product Tax : " + taxes.get(i));
			System.out.println("Product Discount : " + discount.get(i));
			System.out.println("Product Total Cost : " + allPrices.get(i));
			System.out.println("--------------------------------");

		}
		System.out.println("Total Cost of Items : " + totalCost);

	}

}
