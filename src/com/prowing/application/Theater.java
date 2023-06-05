package com.prowing.application;

public class Theater {

	int totalSeats = 10;

	public synchronized void bookSeats(int seats) {
		if (seats <= totalSeats) {
			System.out.println(Thread.currentThread().getName()+" booked "+seats+" seats!");
			totalSeats = totalSeats - seats;
			System.out.println(Thread.currentThread().getName()+" available seats are "+seats);

		} else {
			System.out.println(Thread.currentThread().getName() + " " + seats + " seats not available!!");
			System.out.println(
					Thread.currentThread().getName() + " Available seats are " + totalSeats );
		}
	}
}
