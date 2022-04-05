package com.model;
import javax.persistence.*;

@Entity
public class HallCapacity {
	@Id
	private int HallId;
	private int SeatTypeId;
	private int SeatCount;
	
	public HallCapacity() {
		
	}

	public int getHallId() {
		return HallId;
	}

	public void setHallId(int hallId) {
		HallId = hallId;
	}

	public int getSeatTypeId() {
		return SeatTypeId;
	}

	public void setSeatTypeId(int seatTypeId) {
		SeatTypeId = seatTypeId;
	}

	public int getSeatCount() {
		return SeatCount;
	}

	public void setSeatCount(int seatCount) {
		SeatCount = seatCount;
	}
	
	

}
