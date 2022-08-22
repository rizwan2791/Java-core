package com.aurionpro.model;

public class FixedDeposit {
	String name;
	double principle;
	int duration;
	FestivalType festival;
	public FixedDeposit(String name, double principle, int duration, FestivalType festival) {
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
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
	public FestivalType getFestival() {
		return festival;
	}
	private double getIntrestRates() {
		if(festival == FestivalType.DIWALI) {
			return 7.5;
		}
		else if(festival == FestivalType.CHRISTMAS) {
			return 6.5;
		}
		else if(festival == FestivalType.EID) {
			return 5.5;
		}
		else if(festival == FestivalType.NEWYEAR) {
			return 3.5;
		}else
			return 2.5;
	}
	public void calculateSimpleIntrest() {
		double ans;
		ans=(getIntrestRates()*duration*principle/100);
		System.out.println("Simple Interest : "+ans);
	}
	
}
