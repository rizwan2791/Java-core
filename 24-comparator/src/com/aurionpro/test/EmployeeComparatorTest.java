package com.aurionpro.test;

import com.aurionpro.model.*;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparatorTest {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, "Rizwan", 19));
		list.add(new Employee(99, "Sarah", 10));
		list.add(new Employee(903, "Sa", 9));
		list.add(new Employee(99, "Sarah", 15));
		EmployeeAgeComparator emps= new EmployeeAgeComparator();
		Collections.sort(list, emps); 
		for(Employee emp:list) {
			System.out.println(emp.toString());
		}
	}

}