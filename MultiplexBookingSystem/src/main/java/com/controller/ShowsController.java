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

import com.model.Shows;
import com.model.ShowsDAO;



@RestController
public class ShowsController {
	
	@Autowired
	ShowsDAO showsDAO;
	
	@PostMapping("/addshow")
	public String addShow(@RequestBody Shows shows) {
		showsDAO.save(shows);
		return "Show has been added";	
	}
	
	@GetMapping("/getallshows")
	public Iterable<Shows> getAllShows(){
		return showsDAO.findAll();
	}
	
	@PatchMapping("/updateshow")
	public String updateShow(@RequestBody Shows shows) {
		showsDAO.save(shows);
		return "Show has been Updated";	
	}
	
	@DeleteMapping("/deleteshow/{id}")
	public String deleteShow(@PathVariable("id") int showId) {
		showsDAO.deleteById(showId);
		return "Show Deleted";
	}
	
	@GetMapping("/findShow/{id}")
	public Optional<Shows> findaShow(@PathVariable("id") int showid) {
		return showsDAO.findById(showid);
	}

}
