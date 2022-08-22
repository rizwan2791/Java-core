package com.aurionpro.model;

public class AnnonymousClass {

	public static void main(String[] args) {
//		Animal animal = new Animal();
//		animal.AnimalShow();
		Animal animals = new Animal() {
			public void AnimalShow() { 
				System.out.println("Hzzzzzzz");
			}
		};
		animals.AnimalShow();
	}

}