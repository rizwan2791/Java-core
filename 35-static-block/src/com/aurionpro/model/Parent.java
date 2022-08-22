package com.aurionpro.model;

public class Parent {
	static int a = 10;
	Parent(){
		System.out.println("In parent Constructor");
	}
	{
		System.out.println("Inside Parent IIB ");
	}
	static {
		System.out.println(a);
		System.out.println("I am in parent");
	}
}