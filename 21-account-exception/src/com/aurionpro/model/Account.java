package com.aurionpro.model;

import javax.management.RuntimeErrorException;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public int getId() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) throws InsufficeintFundsException {
		if(amount > balance) {
			throw new InsufficeintFundsException("Insufficient Fundss");
		}else {
			balance-=amount;
			
		}
		
		
	}
	@Override
	public String toString() {
		return "Account [id=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	
}
}
