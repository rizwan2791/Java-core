package com.aurionpro.model;

public class Child extends Parent {
	static int b = 20;
	Child(){
		System.out.println("i Am in Child constructor");
	}
	{
		System.out.println("Inside Child IIB ");
	}
	static {
		System.out.println(b);
		System.out.println("I am in Child ");
	}

}