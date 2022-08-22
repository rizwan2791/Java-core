package com.aurionpro.model;

public class Man implements IMannerable, IEmotional {
	
	@Override
	public void greet() {
		System.out.println("Man is greeting..");

	}

	@Override
	public void depart() {
		System.out.println("Man is Departing..");

	}
	@Override
	public void cry() {
		System.out.println("Man is Crying..");

	}

	@Override
	public void laugh() {
		System.out.println("Man is laughing...");

	}



}
