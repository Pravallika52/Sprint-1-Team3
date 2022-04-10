package com.model;
import javax.persistence.*;

@Entity
public class BookingDetails {
	@Id
	@GeneratedValue
	private int bookingDetailsId;
	@ManyToOne
	private Booking booking;
	@ManyToOne
	private SeatType seatType;
	private int noofSeats;
	
	public BookingDetails() {
		
	}
	
	public BookingDetails(int bookingDetailsId, Booking booking,
			SeatType seatType, int noofSeats) {
		super();
		this.bookingDetailsId = bookingDetailsId;
		this.booking = booking;
		this.seatType = seatType;
		this.noofSeats = noofSeats;
	}

	public int getBookingDetailsId() {
		return bookingDetailsId;
	}

	public void setBookingDetailsId(int bookingDetailsId) {
		this.bookingDetailsId = bookingDetailsId;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public int getNoofSeats() {
		return noofSeats;
	}

	public void setNoofSeats(int noofSeats) {
		this.noofSeats = noofSeats;
	}
	
}









