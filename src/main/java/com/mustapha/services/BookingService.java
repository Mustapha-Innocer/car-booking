package com.mustapha.services;

import java.util.ArrayList;
import java.util.List;

import com.mustapha.interfaces.IBookingService;
import com.mustapha.models.Book;
import com.mustapha.models.Car;
import com.mustapha.models.User;

public class BookingService implements IBookingService {
	private UserService userService;
	private List<Book> bookings;

	public BookingService(UserService userService) {
		this.userService = userService;
		this.bookings = new ArrayList<>();
	}

	@Override
	public Book createBooking(User user, Car car) {
		Book book = new Book(car, true);
		bookings.add(book);
		userService.addCar(user, car);
		return book;
	}

	@Override
	public List<Book> getAllBookings() {
		return bookings;
	}

}
