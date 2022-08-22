package com.aurionpro.model;

public class MovieBookApp extends Thread {
	static BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		b = new BookTheaterSeat();
		MovieBookApp rizwan = new MovieBookApp();
		rizwan.seats = 7;
		rizwan.start();
		MovieBookApp sarah = new MovieBookApp();
		sarah.seats = 6;
		sarah.start();
	}

}