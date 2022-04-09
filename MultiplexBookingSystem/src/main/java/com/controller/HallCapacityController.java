package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.HallCapacity;
import com.model.HallCapacityDAO;

@RestController
public class HallCapacityController {
	@Autowired
	HallCapacityDAO hallCapacityDAO;
	
	@PostMapping("/addhallcapacity")
	public String addHallCapacity(@RequestBody HallCapacity hallCapacity) {
		hallCapacityDAO.save(hallCapacity);
		return "Hall Capacity Saved";
	}

}
