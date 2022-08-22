package com.aurionpro.model;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<String> linklist=new LinkedList<String>();
		linklist.add("Rizwan");
		linklist.add("Shani");
		linklist.add("Ravi");
		linklist.add("kaif");
		Iterator<String> i=linklist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-----------------------");
		linklist.add(2,"Sarah");
		System.out.println(linklist);
		System.out.println("---------------------");
		linklist.add("Max");
		System.out.println(linklist);
		System.out.println("---------------------");
		linklist.addFirst("Zain");
		linklist.addLast("Richer");
		System.out.println(linklist);
		System.out.println("------------------");
		LinkedList<String> linklist2=new LinkedList<String>();
		linklist2.addAll(linklist);
		System.out.println(linklist2);
		System.out.println("---------------------");
		linklist2.remove("Max");
		System.out.println(linklist2);
		System.out.println("---------------------");
		linklist2.remove(3);
		System.out.println(linklist2);
		System.out.println("---------------------");
		linklist2.removeFirst();
		linklist2.removeLast();
		System.out.println(linklist2);
		System.out.println("---------------------");
		linklist2.addFirst("Rizwan");
		System.out.println(linklist2);
		linklist2.removeFirstOccurrence("Rizwan");
		System.out.println(linklist2);

		
	}

}