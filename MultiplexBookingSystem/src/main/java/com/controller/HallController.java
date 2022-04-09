package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Hall;
import com.model.HallDAO;

@RestController
public class HallController {
	
	@Autowired
	HallDAO hallDAO;
	
	@PostMapping("/addhall")
	public String addHall(@RequestBody Hall hall) {
		hallDAO.save(hall);
		return "Hall has been added";
	}
	
	@GetMapping("/getallhalls")
	public Iterable<Hall> getALlHalls(){
		return hallDAO.findAll();
	}
	
	@PatchMapping("/updatehall")
	public String updateHall(@RequestBody Hall hall) {
		hallDAO.save(hall);
		return "Hall has been Updated";
	}

	@DeleteMapping("/deletehall/{id}")
	public String deleteHall(@PathVariable("id") int hallId) {
		hallDAO.deleteById(hallId);
		return "Hall Deleted";
	}
}
