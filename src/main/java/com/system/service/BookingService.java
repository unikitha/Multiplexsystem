package com.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.Repository.BookingRepo;
import com.system.model.BookDetails;
import com.system.model.Booking;

@Service
public class BookingService implements IBookingService {

	@Autowired
	private BookingRepo bookRepo;

	public Booking addBooking(Booking booking) {

		BookDetails bookDetails = booking.getBookDetails();
		bookDetails.setBooking(booking);
		booking = bookRepo.save(booking);
		return booking;
	}

	public Booking findByBookId(int bookId) {
		Booking book = bookRepo.findByBookId(bookId);
		return book;
	}

}
