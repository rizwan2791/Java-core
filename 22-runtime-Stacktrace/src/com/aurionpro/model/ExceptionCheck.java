package com.aurionpro.model;

public class ExceptionCheck {
	public static void main(String[] args)  {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("Main");
		}
		System.out.println("End of main...");
	}

	private static void method1() throws Exception {
		method2();
		System.out.println("End of method 1");

	}

	private static void method2() throws Exception {
		method3();
		System.out.println("End of method 2");

	}

	private static void method3() throws Exception {
		throw new Exception("Error in method 3");

	}
}

