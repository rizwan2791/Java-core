package com.aurionpro.model;

public class ShoppingMall {
	IBankTransations bank;

	public ShoppingMall(IBankTransations bank) {
		super();
		this.bank = bank;
	}
	public void PurchansingUsingCard(double amount) {
		bank.Transaction(amount);
	}

	

}
