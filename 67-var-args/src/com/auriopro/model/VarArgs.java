package com.auriopro.model;

public class VarArgs {
	public void sum(int...n) {
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		System.out.println("Sum of numbers is  : "+sum);
	}
	public void addString(int n,String... s) {
		System.out.println("Number is : "+n);
		for(String i:s) {
			System.out.println(i);
		}
	}

}
