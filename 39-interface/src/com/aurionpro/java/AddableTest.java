package com.aurionpro.java;

public class AddableTest {
	public static void main(String[] args) {
		IAddable add=new IAddable() {
			@Override
			public int addInteger(int a, int b) {
				return a+b;
			}
		};
		System.out.println("Addition : "+add.addInteger(10, 20));
		IAddable add1=(a,b)->{
			return a+b;
		};
		System.out.println("Addition : "+add1.addInteger(100, 200));
		IAddable add2=AddableTest::addition;
		System.out.println("Addition : "+add2.addInteger(2, 3));
	}
	public static int addition(int a,int b) {
		return a+b;
	}
}
