package com.system.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.system.model.Booking;

@Repository
public interface BookingRepo extends CrudRepository<Booking,Serializable> {
	public Booking findByBookId(int bookId);
}
