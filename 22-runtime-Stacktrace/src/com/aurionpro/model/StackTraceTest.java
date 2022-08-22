package com.aurionpro.model;

public class StackTraceTest {
	public static void main(String[] args) {
		method1();
		System.out.println("End of main");
	}

	private static void method1() {
		try {
			method2();
		} catch (RuntimeException e) {
			System.out.println("Catch Executed");
		}
		System.out.println("End of method 1");

	}

	private static void method2() {
		method3();
		System.out.println("End of method 2");

	}

	private static void method3() {
		throw new RuntimeException("Error in method 3");

	}
}
