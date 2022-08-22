package com.aurionpro.test;

import java.util.*;

public class PrintStatement {

	public static void main(String args[]) {
		int sum = 0;
		int maxvalue = Integer.parseInt(args[0]);
		int minvalue = Integer.parseInt(args[0]);
		int[] newArray = new int[args.length];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(newArray);
		if (newArray.length % 2 != 0) {
			System.out.println("median :" + newArray[newArray.length / 2]);
		} else {
			System.out.println("median : " + (newArray[newArray.length / 2] + newArray[newArray.length / 2 - 1]) / 2.0);
		}
		for (int i = 0; i < args.length; i++) {
			if (minvalue > Integer.parseInt(args[i])) {
				minvalue = Integer.parseInt(args[i]);
			}
			if (maxvalue < Integer.parseInt(args[i])) {
				maxvalue = Integer.parseInt(args[i]);
			}

			sum = sum + Integer.parseInt(args[i]);

		}

		double average = sum / args.length;
		System.out.println("Average :"+average);
		System.out.println("Sum :"+sum);
		System.out.println("Min :"+minvalue);
		System.out.println("Max :"+maxvalue);
		System.out.println("Frequency");
		int size = newArray.length;
		countFrequency(newArray, size);
	}

	static void countFrequency(int[] newArray, int n) {

		Arrays.sort(newArray);

		for (int i = 0; i < n; i++) 
		{
			int count = 1;

			while (i < n - 1 && newArray[i] == newArray[i + 1]) {
				i++;
				count++;
			}
			System.out.println(newArray[i] + ": " + count);

			count++;

		}

	}
}