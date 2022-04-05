package com.model;
import javax.persistence.*;

@Entity
public class BookingDetails {
	@Id
	private int BookingId;
	private int SeatTypeId;
	private int NoofSeats;
	
	public BookingDetails() {
		
	}

	public int getBookingId() {
		return BookingId;
	}

	public void setBookingId(int bookingId) {
		BookingId = bookingId;
	}

	public int getSeatTypeId() {
		return SeatTypeId;
	}

	public void setSeatTypeId(int seatTypeId) {
		SeatTypeId = seatTypeId;
	}

	public int getNoofSeats() {
		return NoofSeats;
	}

	public void setNoofSeats(int noofSeats) {
		NoofSeats = noofSeats;
	}

	
}
