package com.system.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="BookDetails")
public class BookDetails{
		@Id
		@Column(name = "seatId")
		private int seatId;
		
		@Column(name = "noOfseats")
		private int noOfseats;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "book_id")
		@JsonBackReference
		private Booking booking;

		public int getSeatId() {
			return seatId;
		}

		public void setSeatId(int seatId) {
			this.seatId = seatId;
		}

		public int getNoOfseats() {
			return noOfseats;
		}

		public void setNoOfseats(int noOfseats) {
			this.noOfseats = noOfseats;
		}

		public Booking getBooking() {
			return booking;
		}

		public void setBooking(Booking booking) {
			this.booking = booking;
		}
		
}
