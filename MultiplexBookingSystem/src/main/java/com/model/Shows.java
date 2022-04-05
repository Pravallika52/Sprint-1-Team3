package com.model;
import javax.persistence.*;

@Entity
public class Shows {
	@Id
	@GeneratedValue
	private int ShowId;
	private int HallId;
	private int MovieId;
	private int SlotNo;
	private java.sql.Date FromDate;
	private java.sql.Date ToDate;
	
	public Shows() {
		
	}

	public int getShowId() {
		return ShowId;
	}

	public void setShowId(int showId) {
		ShowId = showId;
	}

	public int getHallId() {
		return HallId;
	}

	public void setHallId(int hallId) {
		HallId = hallId;
	}

	public int getMovieId() {
		return MovieId;
	}

	public void setMovieId(int movieId) {
		MovieId = movieId;
	}

	public int getSlotNo() {
		return SlotNo;
	}

	public void setSlotNo(int slotNo) {
		SlotNo = slotNo;
	}

	public java.sql.Date getFromDate() {
		return FromDate;
	}

	public void setFromDate(java.sql.Date fromDate) {
		FromDate = fromDate;
	}

	public java.sql.Date getToDate() {
		return ToDate;
	}

	public void setToDate(java.sql.Date toDate) {
		ToDate = toDate;
	}

	
	
	

}
