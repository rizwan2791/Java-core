package com.aurionpro.model;
import java.util.ArrayList;
import java.util.Collections;
public class List {
	public static void main(String args[]) {
		ArrayList<Integer> list =new ArrayList<Integer>();
//		ArrayList<String> listTwo =new ArrayList<String>();		
		list.add(3);
		list.add(2);
		list.add(3);
		System.out.println("List : "+ list);
		//get index elements
		System.out.println("Element at 0th index : "+list.get(0));
		//adding element at specific index
		list.add(2, 100);
		System.out.println("Adding Element at specific index : "+list);
		//set/replacing element at specific index
		list.set(2,200);
		System.out.println("Replacing element At 2nd index : "+list);
		list.remove(3);
		//removing element from index
		System.out.println("Removing element at 3rd index : "+list);
		//size of array
		System.out.println("Size of List : "+list.size());
		System.out.println("Printing using for LOOP ");
		//loops
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//sorting
		Collections.sort(list);
		System.out.println("Sorted List : "+list);
	}
	
}