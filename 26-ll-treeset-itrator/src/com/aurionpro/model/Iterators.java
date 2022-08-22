package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		Iterator<Integer> i=obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
