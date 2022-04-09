package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.SeatType;
import com.model.SeatTypeDAO;

@RestController
public class SeatTypeController {
	@Autowired
	SeatTypeDAO seatTypeDAO;
	
	@PostMapping("/addseattype")
	public String addSeatType(@RequestBody SeatType seatType) {
		seatTypeDAO.save(seatType);
		return "Seat Type Added";
	}

}
