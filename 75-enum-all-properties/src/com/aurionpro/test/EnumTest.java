package com.aurionpro.test;

public class EnumTest {
	public static void main(String[] args) {
		SmartPhoneType s=SmartPhoneType.APPLE;
		switch(s) {
		case APPLE:
			System.out.println("Apple is Expensive");
			break;
		case SAMSUNG:
			System.out.println("Samsung is Best");	
		}
		System.out.println("Apple : "+SmartPhoneType.APPLE.getPrice());
		System.out.println("Samsung : "+SmartPhoneType.SAMSUNG.getPrice());
		s.smartPhoneDetails();
		System.out.println(SmartPhoneType.SAMSUNG.ordinal());
		System.out.println(SmartPhoneType.SAMSUNG.price);
		System.out.println(SmartPhoneType.SAMSUNG.hashCode());
		System.out.println(SmartPhoneType.SAMSUNG.getClass());
		System.out.println(SmartPhoneType.SAMSUNG.name());
		SmartPhoneType m[]=SmartPhoneType.values();//given by values
		for(SmartPhoneType mobile:m) {
			System.out.println(mobile);
			
		}
	}

}
