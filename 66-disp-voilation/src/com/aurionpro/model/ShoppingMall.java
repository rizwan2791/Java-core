package com.aurionpro.model;

public class ShoppingMall {
	DebitCard debit;
	CreditCard credit;
	public ShoppingMall(CreditCard credit) {
		super();
		this.credit = credit;
	}
	public ShoppingMall(DebitCard debit) {
		super();
		this.debit = debit;
	}
	public void PurchansingUsingCard(double amount) {
		debit.Transaction(amount);
	}
	public void PurchansingUsingCards(double amount) {
		credit.Transaction(amount);
	}
	

}
