package com.aurionpro.model;

public class OuterClass {
	int id;
	String name;

	public OuterClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void printOuterClass() {
		System.out.println("Student id : " + id);
		System.out.println("Student Name : " + name);
	}

	class Inner {
		int rank;
		double marks;

		public Inner(int rank, double marks) {
			super();
			this.rank = rank;
			this.marks = marks;
		}

		public int getRank() {
			return rank;
		}

		public double getMarks() {
			return marks;
		}

		public void printInnerClass() {
			System.out.println("Rank : " + rank);
			System.out.println("Marks : " + marks);
		}

	}

}