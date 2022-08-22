package com.aurionpro.model;

import java.util.*;


public class LineItemTest {

	public static void main(String[] args)  {

		Set<LineItem> items = new HashSet<LineItem>();
		items.add(new LineItem(101, "mario", 12, 8));
		items.add(new LineItem(101, "maggie", 1, 10));
		items.add(new LineItem(101, "pizza", 5, 4));
		items.add(new LineItem(101, "pizza", 5, 4));

		for (LineItem item : items) {
			System.out.println(item);
		}
		System.out.println("Total Bill : " + calculateTotalBill(items));

	}
	private static double calculateTotalBill(Set<LineItem> items) {

		ArrayList<LineItem> itemsvalue = new ArrayList<LineItem>(items);
		double sum = 0;
		for (int i = 0; i < itemsvalue.size(); i++) {
			sum = sum + itemsvalue.get(i).getTotalPrice();
		}

		return (sum);

	}

}