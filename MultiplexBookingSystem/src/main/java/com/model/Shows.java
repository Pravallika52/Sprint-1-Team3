package com.model;

import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Shows {
	@Id
	@GeneratedValue
	private int showId;
	@ManyToOne
	private Hall hall;
	@ManyToOne
	private Movies movies;
	private int slotNo;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date fromDate;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date toDate;
	
	public Shows() {
		
	}

	public Shows(int showId, Hall hall, Movies movies, 
			int slotNo, Date fromDate, Date toDate) {
		super();
		this.showId = showId;
		this.hall = hall;
		this.movies = movies;
		this.slotNo = slotNo;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}

