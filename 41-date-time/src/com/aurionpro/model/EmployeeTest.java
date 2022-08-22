package com.aurionpro.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] emp = { new Employee("Rizwan", 101, LocalDate.of(1998, 9, 11), LocalTime.of(10, 15, 20)),
						new Employee("Sarah", 102, LocalDate.of(1999, Month.APRIL, 12), LocalTime.of(12, 6, 20)),
						new Employee("Kaif", 102, LocalDate.of(2000, 8, 12), LocalTime.of(2, 6, 20)) };
		for (Employee e : emp) {
			System.out.println(e.toString());
		}

	}
}