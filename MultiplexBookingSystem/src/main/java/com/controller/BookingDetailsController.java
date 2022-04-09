package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.BookingDetails;
import com.model.BookingDetailsDAO;

@RestController
public class BookingDetailsController {
	@Autowired
	BookingDetailsDAO bookingDetailsDAO;
	
	@PostMapping("/addbookingdetails")
	public String addBookingDetails(@RequestBody BookingDetails bookingDetails) {
		bookingDetailsDAO.save(bookingDetails);
		return "Booking Details Added";
	}
	
	@GetMapping("/findbookingdetails/{id}")
	public Optional<BookingDetails> findbooking(@PathVariable("id") int bookingid) {
		return bookingDetailsDAO.findById(bookingid);
	}
	

}
