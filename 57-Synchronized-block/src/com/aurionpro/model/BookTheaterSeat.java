package com.aurionpro.model;

public class BookTheaterSeat {
	int totalSeats = 10;

	void bookSeat(int seats) {
		System.out.println("Hi : " + Thread.currentThread().getName());
		synchronized (this) {
			if (totalSeats >= seats) {
				System.out.println(seats + " seats booked sucessfully");
				totalSeats = totalSeats - seats;
				System.out.println("Seats left " + totalSeats);
			} else {
				System.out.println("Sorry seats cannot be booked");
				System.out.println("Seats Left " + totalSeats);
			}
		}
		System.out.println("Hi : " + Thread.currentThread().getName());
	}

}
