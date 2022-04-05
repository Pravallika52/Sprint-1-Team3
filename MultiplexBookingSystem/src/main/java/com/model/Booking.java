package com.model;

import javax.persistence.*;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private int BookingId;
	private int ShowId;
	private int UserId;
	private java.sql.Date BookedDate;
	private java.sql.Date ShowDate;
	
	public Booking() {
		
	}

	public int getBookingId() {
		return BookingId;
	}

	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}

	public int getShowId() {
		return ShowId;
	}

	public void setShowId(int showId) {
		ShowId = showId;
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public java.sql.Date getBookedDate() {
		return BookedDate;
	}

	public void setBookedDate(java.sql.Date bookedDate) {
		BookedDate = bookedDate;
	}

	public java.sql.Date getShowDate() {
		return ShowDate;
	}

	public void setShowDate(java.sql.Date showDate) {
		ShowDate = showDate;
	}

	
	

}
