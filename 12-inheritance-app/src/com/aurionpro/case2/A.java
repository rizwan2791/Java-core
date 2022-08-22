package com.aurionpro.case2;

public class A {
	private int foo;
	public A() {
		this(100);
	}
	public A(int foo) {
		this.foo = foo;
		System.out.println("Value of foo "+foo);
	}
	
	
}
