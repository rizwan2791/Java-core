package com.aurionpro.model;

public class ThreadImplementingRunnable implements Runnable {
	public void run() {
		System.out.println("I am in Runnable Thread Class");
	}

	public static void main(String[] args) {
		ThreadImplementingRunnable t = new ThreadImplementingRunnable();
		Thread th = new Thread(t);
		th.start();
	}
}