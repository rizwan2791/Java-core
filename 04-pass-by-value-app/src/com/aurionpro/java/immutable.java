package com.aurionpro.java;

public class immutable {
	public static void main(String args[]) {
		String name ="Rizwan";
		System.out.println(name.hashCode());
		name="Rizwan";
		System.out.println(name.hashCode());
		String name1=new String("Rizwan").intern();
		if (name1.equals(name)) {
			System.out.println("Equal");
		}else {
			System.out.println("not Equal");
		}
	}

}
