package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Booking;
import com.model.BookingDAO;

@RestController
public class BookingController {
	@Autowired
	BookingDAO bookingDAO;
	
	@PostMapping("/addbooking")
	public String addBooking(@RequestBody Booking booking) {
		bookingDAO.save(booking);
		return "Booking Done";
	}
	
	@GetMapping("/gettallbookings")
	public Iterable<Booking> getAllBooking(){
		return bookingDAO.findAll();
	}
	
	@PatchMapping("/updatebooking")
	public String updateBooking(@RequestBody Booking booking) {
		bookingDAO.save(booking);
		return "Booking Updated";
	}
	
	@DeleteMapping("/deletebooking/{id}")
	public String deleteBooking(@PathVariable("id") int bookingId) {
		bookingDAO.deleteById(bookingId);
		return "Booking Deleted";
	}
	
	@GetMapping("/findbooking/{id}")
	public Optional<Booking> findbooking(@PathVariable("id") int bookingid) {
		return bookingDAO.findById(bookingid);
	}
	
	@DeleteMapping("/admin/cancelbooking/{id}")
	public String cancelBooking(@PathVariable("id") int bookingid) {
		bookingDAO.deleteById(bookingid);
		return "Booking Canceled";
	}


}
