package com.aurionpro.model;

public class AddableTest {

	public static void main(String[] args) {

		IAddable add = new IAddable() {
			@Override
			public int addInteger(int a, int b) {
				return a + b;
			}
		};
		int total = add.addInteger(20, 30);
		System.out.println("Addition in anonymous  : " + total);
		IAddable add2 = AddableTest::execute;
		int total3 = add2.addInteger(90, 8);
		System.out.println("Add in static reference:-" + total3);
		IAddable add1 = (a, b) -> {
			return a + b;
		};
		int total1 = add1.addInteger(50, 60);
		System.out.println("Inside lambda addition: - " + total1);

	}

	public static int execute(int i, int j) {
		return i + j;
	}

}
