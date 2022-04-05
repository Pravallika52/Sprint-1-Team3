package com.model;
import javax.persistence.*;

@Entity
public class Movies {
	@Id
	@GeneratedValue
	private int MovieId;
	private String MovieName;
	
	public Movies() {
		
	}

	public int getMovieId() {
		return MovieId;
	}

	public void setMovieId(int movieId) {
		MovieId = movieId;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	
}
