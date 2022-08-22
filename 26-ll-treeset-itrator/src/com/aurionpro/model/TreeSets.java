package com.aurionpro.model;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args) {
		Set<Integer> mySet=new TreeSet<Integer>();
		mySet.add(90);
		mySet.add(80);
		mySet.add(40);
		mySet.add(100);
		mySet.add(700);
		mySet.add(350);
		System.out.println(mySet);//elements ordered in ascending order
		Iterator<Integer> i=mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	
}