package com.aurionpro.model;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Sets{

	public static void main(String[] args) {
		Set<Integer> values = new HashSet<>();//Hashset implements Set
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
		values.remove(5);
		values.size();
		System.out.println("10 is added to Set : "+values.add(10));;
		System.out.println("10 is duplicate so not added to Set : "+values.add(10));;//Duplicate not supported
		System.out.print("Not printed in Order :");
		for(int i : values) {
			System.out.print(+i+" "); //not printed in sequence
		}
		System.out.println("\n");
		Set<Integer> val = new TreeSet<>();//for printing in seq
		val.add(7);
		val.add(5);
		val.add(10);
		System.out.print("Printed in Order :");
		for(int i : val) {
			System.out.print(i+" "); //printed in sequence
		}
	}

}