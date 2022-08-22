package com.aurionpro.model;

public class EngineeringTest {

	public static void main(String[] args) {
		Student[] std = { new Student(101, "Vasai", "09/07/2000", BranchType.ARTS),
				new Student(101, "Vasai", "09/07/2000", BranchType.COMMERCE),
				new Student(101, "Vasai", "09/07/2000", BranchType.SCIENCE), };
		for (Student s : std) {
			printStudentDetails(s);
		}
		Professor[] pf = { new Professor(100, "Bandra", "01/01/1995", 1000),
				new Professor(100, "Bandra", "01/01/1995", 20000), new Professor(100, "Bandra", "01/01/1995", 30000), };
		for (Professor p : pf) {
			printProfessorDetails(p);
		}

	}

	private static void printProfessorDetails(Professor p) {
		System.out.println("Professor ID : " + p.getId());
		System.out.println("Professor Address : " + p.getAdd());
		System.out.println("Professor DOB : " + p.getDob());
		System.out.println("Professor salary : " + p.calculateSalary());
		System.out.println("-----------------------------");
	}

	private static void printStudentDetails(Student s) {
		System.out.println("Student ID : " + s.getId());
		System.out.println("Student Address : " + s.getAdd());
		System.out.println("Student DOB : " + s.getDob());
		System.out.println("Student Branch : " + s.getBranch());
		System.out.println("------------------------------");

	}

}
