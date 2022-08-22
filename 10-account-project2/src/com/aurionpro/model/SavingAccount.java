package com.aurionpro.model;

public class SavingAccount extends Account {
	public static final int MINBALANCE = 5000;

	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if (this.getBalance() - amount >= MINBALANCE) {
			this.setBalance(this.getBalance() - amount);
			return true;
		}

		return false;
	}

}
