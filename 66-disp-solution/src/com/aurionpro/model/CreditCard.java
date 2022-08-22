package com.aurionpro.model;

public class CreditCard implements IBankTransations{
	@Override
	public void Transaction(double amount) {
		System.out.println("Payment using Credit card");
	}
}
