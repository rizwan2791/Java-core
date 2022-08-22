package com.aurionpro.test;

import com.aurionpro.model.*;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuesTest {
	public static void main(String[] args) {
		PriorityQueue<Students> prio = new PriorityQueue();
		prio.add(new Students(101, 1, "Rahil"));
		prio.add(new Students(101, 5, "Sahil"));
		prio.add(new Students(101, 3, "Zainab"));
		prio.add(new Students(101, 2, "Sajid"));
		prio.add(new Students(101, 4, "Saheer"));
		System.out.println("Size of priority Queue : " + prio.size());
		System.out.println("Peek : " + prio.peek());
		Iterator<Students> i = prio.iterator();
		while (i.hasNext()) {
			System.out.println(prio.poll().toString());
		}

	}

}