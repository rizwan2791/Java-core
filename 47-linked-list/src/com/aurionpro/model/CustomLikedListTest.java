package com.aurionpro.model;

import java.util.Iterator;

public class CustomLikedListTest {
	public static void main(String[] args) {
		CustomLinkedList<String> list = new CustomLinkedList<String>();
		list.addFirst("Rizwan");
		list.addFirst("Shani");
		list.addFirst("Rahil");
		list.display();
		list.addLast("Sahil");
		list.addLast("Sarah");
		list.addLast("River");
		list.display();
		list.deleteFirst();
		list.display();
		list.deleteLast();
		list.display();
		list.deleteNode("Sahil");
		list.display();
		Iterator<String> i=list.iterator();
		System.out.println("Print using Iterator");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Print using Advance for Loop");
		for(String s:list) {
			System.out.println(s);
		}
		
		
	}

}
