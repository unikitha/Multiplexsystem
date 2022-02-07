package com.system.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="book")
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	
	@Column(name="showid" ,nullable=false,length=4)
	private int showId;
	
	@Column(name="userid" ,nullable=false,length=4)
	private int userId;
	
	@Temporal(TemporalType.DATE)
	private Date bookDate;
	
	@Temporal(TemporalType.DATE)
	private Date showDate;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "booking")
	@JsonManagedReference
	private BookDetails bookDetails;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getBookDate() {
		return bookDate;
	}

	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public BookDetails getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	@Override
	public String toString() {
		return "Booking [bookId=" + bookId + ", showId=" + showId + ", userId=" + userId + "]";
	}

}
