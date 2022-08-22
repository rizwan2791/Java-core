package com.aurionpro.test;

import com.aurionpro.model.Overloading;

public class OverloadingMain {

	public static void main(String[] args) {
		Overloading obj=new Overloading();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.add(10.5, 13.5));
		System.out.println(obj.add(10.1, 12.1, 23.5));
	}

}
