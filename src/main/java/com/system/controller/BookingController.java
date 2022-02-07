package com.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.system.model.Booking;
import com.system.service.IBookingService;

@RestController

public class BookingController {
	@Autowired
	IBookingService service;
		
    @RequestMapping(value = "/createbook",method = RequestMethod.POST)
	@ResponseBody
    public Booking createBook(@RequestBody Booking booking) {
			Booking bookResponse = service.addBooking(booking);
			return bookResponse;
	}
		
	@RequestMapping(value = "/{bookId}",method = RequestMethod.GET)
    @ResponseBody
	public Booking getBookDetails(@PathVariable int bookId) {
			Booking bookResponse = service.findByBookId(bookId);
			return bookResponse;
	}

}
