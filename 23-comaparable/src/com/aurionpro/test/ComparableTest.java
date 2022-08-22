package com.aurionpro.test;

import com.aurionpro.model.*;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
	public static void main(String[] args) {
		ArrayList<Student> list=  new ArrayList<Student>(); 
		list.add(new Student(50, "Rizwan", 20000));
		list.add(new Student(10, "Sarah", 20000));
		list.add(new Student(100, "newbe", 20000));
		System.out.println("Before Sorting");
		for(Student s:list) {
			System.out.println(s.toString());
		}
		Collections.reverse(list);
		System.out.println("After Sorting");
		for(Student s:list) {
			System.out.println(s.toString());
		}
	}
}
