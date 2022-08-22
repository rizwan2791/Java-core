package com.aurionpro.model;

class BookTheaterSeat {
	static int totalSeats = 20;

	synchronized static void bookSeat(int seats) {
		{
			if (totalSeats >= seats) {
				System.out.println(seats + " seats booked sucessfully");
				totalSeats = totalSeats - seats;
				System.out.println("Seats left " + totalSeats);
			} else {
				System.out.println("Sorry seats cannot be booked");
				System.out.println("Seats Left " + totalSeats);
			}
		}
	}
}

class Mythread1 extends Thread {
	BookTheaterSeat b;
	int seats;

	public Mythread1(BookTheaterSeat b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.bookSeat(seats);
	}
}

class Mythread2 extends Thread {
	BookTheaterSeat b;
	int seats;

	public Mythread2(BookTheaterSeat b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.bookSeat(seats);
	}

}

public class MovieBookApp {
	public static void main(String[] args) {
		BookTheaterSeat b1 = new BookTheaterSeat();
		Mythread1 t1 = new Mythread1(b1, 7);
		t1.start();
		Mythread2 t2 = new Mythread2(b1, 6);
		t2.start();
		BookTheaterSeat b2 = new BookTheaterSeat();
		Mythread1 t3 = new Mythread1(b2, 5);
		t3.start();
		Mythread2 t4 = new Mythread2(b2, 6);
		t4.start();
		
		
	}

}
