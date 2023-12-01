package com.mustapha.interfaces;

import java.util.List;

import com.mustapha.models.Book;
import com.mustapha.models.Car;
import com.mustapha.models.User;

public interface IBookingService {
	Book createBooking(User user, Car car);

	List<Book> getAllBookings();
}
