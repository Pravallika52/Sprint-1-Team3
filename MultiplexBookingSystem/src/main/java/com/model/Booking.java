package com.model;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Booking {
	@Id
	@GeneratedValue
	private int bookingId;
	@ManyToOne
	private Shows shows;
	@ManyToOne
	private Users users;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date bookedDate;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date showDate;
	
	public Booking() {
		
	}
	
	public Booking(int bookingId, Shows shows, Users users, 
			Date bookedDate, Date showDate) {
		super();
		this.bookingId = bookingId;
		this.shows = shows;
		this.users = users;
		this.bookedDate = bookedDate;
		this.showDate = showDate;
	}
	
	public int getBookingId() {
		return bookingId;
	}
	
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	
	public Shows getShows() {
		return shows;
	}
	
	public void setShows(Shows shows) {
		this.shows = shows;
	}
	
	public Users getUsers() {
		return users;
	}
	
	public void setUsers(Users users) {
		this.users = users;
	}
	
	public Date getBookedDate() {
		return bookedDate;
	}
	
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	
	public Date getShowDate() {
		return showDate;
	}
	
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	
}

