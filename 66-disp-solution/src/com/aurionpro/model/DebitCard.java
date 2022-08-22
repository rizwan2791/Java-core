package com.aurionpro.model;

public class DebitCard implements IBankTransations{
	@Override
	public void Transaction(double amount) {
		System.out.println("Payment using Debit card");
	}

}
