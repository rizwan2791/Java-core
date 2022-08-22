package com.aurionpro.model;

public class FixedDeposit {
	String name;
	double principle;
	int duration;
	IInterest interest;
	public FixedDeposit(String name, double principle, int duration, IInterest interest) {
		super();
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.interest = interest;
	}
	public String getName() {
		return name;
	}
	public double getPrinciple() {
		return principle;
	}
	public int getDuration() {
		return duration;
	}
	public IInterest getInterest() {
		return interest;
	}
	public void CalculateSimpleInterest() {
		double ans;
		ans=(interest.getInterest()*duration*principle/100);
		System.out.println("Simple Interest : "+ans);
	}

}
