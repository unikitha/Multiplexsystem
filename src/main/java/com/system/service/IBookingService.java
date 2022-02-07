package com.system.service;

import com.system.model.Booking;

public interface IBookingService {
	public Booking addBooking(Booking booking);
	public Booking findByBookId(int bookId);
}
