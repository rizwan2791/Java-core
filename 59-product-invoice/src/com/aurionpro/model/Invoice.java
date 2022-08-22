package com.aurionpro.model;

import java.util.ArrayList;

public class Invoice {
	ArrayList<Product> products;
	private double totalPrice;

	public Invoice(ArrayList<Product> items) {
		this.products = items;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ArrayList<Double> calculateTax() {
		ArrayList<Double> taxes = new ArrayList<Double>();
		for (int j = 0; j < products.size(); j++) {
			taxes.add(products.get(j).getAmount() * products.get(j).getTax() / 100);
		}
		return taxes;
	}

	public ArrayList<Double> calculateDiscount() {
		ArrayList<Double> discounts = new ArrayList<Double>();
		for (int j = 0; j < products.size(); j++) {
			discounts.add((products.get(j).getAmount() * products.get(j).getDiscountPercent()) / 100);
		}

		return discounts;

	}

	public ArrayList<Double> invoiceTotalPrice() {
		ArrayList<Double> alltotalprices = new ArrayList<Double>();
		for (int j = 0; j < products.size(); j++) {
			alltotalprices
					.add(products.get(j).getAmount() + products.get(j).getTax() - products.get(j).getDiscountPercent());
		}
		return alltotalprices;
	}

	public double totalprices() {
		for (int i = 0; i < products.size(); i++) {
			totalPrice = totalPrice + products.get(i).getAmount() + products.get(i).getTax()- products.get(i).getDiscountPercent();
		}
		return totalPrice;
	}

	public void displayAllBills() {
		ArrayList<Double> TotalTax = calculateTax();
		ArrayList<Double> TotalDiscount = calculateDiscount();
		ArrayList<Double> TotalPrice = invoiceTotalPrice();
		double totalcost = totalprices();
		InvoicePrint print = new InvoicePrint(TotalTax, TotalDiscount, TotalPrice, products, totalcost);
		print.printDetails();

	}

}
