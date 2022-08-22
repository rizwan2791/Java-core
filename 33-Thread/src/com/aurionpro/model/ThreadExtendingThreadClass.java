package com.aurionpro.model;

public class ThreadExtendingThreadClass extends Thread {
	public void run() {
		System.out.println("I am in extends Thread Class");
	}

	public static void main(String[] args) {
		ThreadExtendingThreadClass t = new ThreadExtendingThreadClass();
		t.start();
	}
}