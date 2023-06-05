package com.prowing.application;

public class BookMySeat {

	public static void main(String[] args) {

		Theater theater = new Theater();
		ThreadOne t1 = new ThreadOne(theater,5);
		t1.setName("sham");
		t1.start();

		ThreadOne t2 = new ThreadOne(theater, 7);
		t2.setName("Ram");
		t2.start();

	}
}
