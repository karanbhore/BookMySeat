package com.prowing.application;

public class ThreadOne extends Thread {

	Theater theater;
	int seats;

	public ThreadOne(Theater theater, int seats) {
		super();
		this.theater = theater;
		this.seats = seats;
	}

	public void run() {
		theater.bookSeats(seats);
	}

}
