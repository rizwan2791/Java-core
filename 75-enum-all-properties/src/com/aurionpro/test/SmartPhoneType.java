package com.aurionpro.test;

public enum SmartPhoneType {
	APPLE,NOKIA(50000),SAMSUNG(30000),REALME,REDMI,MOTO;
	int price;
	SmartPhoneType(){
		price=40000;
	}
	SmartPhoneType(int p){
		price=p;
	}
	public int getPrice() {
		return price;
	}
	public void smartPhoneDetails() {
		System.out.println("These is best SmartPhone");
	}

}
