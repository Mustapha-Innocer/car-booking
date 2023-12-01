package com.mustapha.models;

import java.util.UUID;

public class Book {

	private UUID id;
	private Car car;
	private boolean isBooked;

	public Book(Car car, boolean isBooked) {
		id = UUID.randomUUID();
		this.car = car;
		this.isBooked = isBooked;
	}

	public Car getCar() {
		return car;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", car=" + car + "]";
	}

}
