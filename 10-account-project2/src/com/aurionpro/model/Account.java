package com.aurionpro.model;

public abstract class Account {
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
	public abstract boolean withdraw(double amount);

	public boolean deposit(double amount) {
		if(amount<0) {
			balance=balance+amount;
			return true;
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Account [id=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	
}
}
