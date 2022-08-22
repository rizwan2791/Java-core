package com.auriopro.model;

public class VarargsTest {

	public static void main(String[] args) {
		VarArgs var=new VarArgs();
		var.sum(10,20,30,50,50);
		var.sum();
		
		System.out.println("-----------------");
		var.addString(10,"Rizwan","Sabah","kaif");
		var.addString(200);
	}

}
