package com.model;
import javax.persistence.*;

@Entity
public class SeatType {
	@Id
	@GeneratedValue
	private int SeatTypeId;
	private String SeatTypeDesc;
	private float SeatFare;
	
	public SeatType() {
		
	}

	public int getSeatTypeId() {
		return SeatTypeId;
	}

	public void setSeatTypeId(int seatTypeId) {
		SeatTypeId = seatTypeId;
	}

	public String getSeatTypeDesc() {
		return SeatTypeDesc;
	}

	public void setSeatTypeDesc(String seatTypeDesc) {
		SeatTypeDesc = seatTypeDesc;
	}

	public float getSeatFare() {
		return SeatFare;
	}

	public void setSeatFare(float seatFare) {
		SeatFare = seatFare;
	}
	
	

}
