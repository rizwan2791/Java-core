package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private double balance;
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public boolean withdraw(double amount) {
		if (balance-amount>=1000) {
			balance=balance-amount;
			return true;
		}
		
			return false;
		}
			
		
	
	public boolean deposit(double amount) {
		if(amount<0) {
			balance=balance+amount;
			return true;
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	
}
}
