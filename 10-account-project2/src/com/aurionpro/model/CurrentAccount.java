package com.aurionpro.model;

public class CurrentAccount extends Account {

	private static final int Overdraft = -50000;

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if (this.getBalance() - amount >= Overdraft) {
			this.setBalance(this.getBalance() - amount);
			return true;
		}

		return false;
	}

}