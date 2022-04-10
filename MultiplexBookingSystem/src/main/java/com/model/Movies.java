package com.model;
import javax.persistence.*;

@Entity
public class Movies {
	@Id
	@GeneratedValue
	private int movieId;
	private String movieName;
	
	public Movies() {
		
	}

	public Movies(int movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
}

