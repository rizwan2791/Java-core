package com.aurionpro.model;

public interface Student {
	public void show();
	default void hello() {
		System.out.println("Hello");
	}

}
