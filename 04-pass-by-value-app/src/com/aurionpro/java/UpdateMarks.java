package com.aurionpro.java;

public class UpdateMarks {

	public static void main(String[] args) {
		int marks[] = { 50, 60, 70, 80 };
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
		updateMarksToZero(marks);
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i] + " ");
		}
	}

	static void updateMarksToZero(int[] marks) {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = 0;
		}

	}
}
