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

import com.model.Movies;
import com.model.MoviesDAO;

@RestController
public class MoviesController {
	
	@Autowired
	MoviesDAO moviesDAO;
	
	@PostMapping("/addmovie")
	public String addMovie(@RequestBody Movies movies) {
		moviesDAO.save(movies);
		return "Movie has been saved successfully";
	}
	
	@GetMapping("/getallmovies")
	public Iterable<Movies> getAllMovies(){
		return moviesDAO.findAll();
	}

	@PatchMapping("/updatemovie")
	public String updateMovie(@RequestBody Movies movies) {
		moviesDAO.save(movies);
		return "Movie has been Updated successfully";
	}
	
	@DeleteMapping("/deletemovie/{id}")
	public String deleteMovie(@PathVariable("id") int movieId) {
		moviesDAO.deleteById(movieId);
		return "Movie Deleted";
	}
	
	@GetMapping("/findmovie/{id}")
	public Optional<Movies> findMovie(@PathVariable("id") int movieid) {
		return moviesDAO.findById(movieid);
	}
}
