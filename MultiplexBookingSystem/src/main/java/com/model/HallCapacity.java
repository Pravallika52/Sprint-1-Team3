package com.model;
import javax.persistence.*;

@Entity
public class HallCapacity {
	@Id
	@GeneratedValue
	private int hallCapacityId;
	@ManyToOne
	private Hall hall;
	@ManyToOne
	private SeatType seatType;
	private int seatCount;
	
	public HallCapacity() {
		
	}
	
	public HallCapacity(int hallCapacityId, Hall hall, SeatType seatType, int seatCount) {
		super();
		this.hallCapacityId = hallCapacityId;
		this.hall = hall;
		this.seatType = seatType;
		this.seatCount = seatCount;
	}

	public int getHallCapacityId() {
		return hallCapacityId;
	}

	public void setHallCapacityId(int hallCapacityId) {
		this.hallCapacityId = hallCapacityId;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	

}
