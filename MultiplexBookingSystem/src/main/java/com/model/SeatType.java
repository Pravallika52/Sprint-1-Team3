package com.model;
import javax.persistence.*;

@Entity
public class SeatType {
	@Id
	@GeneratedValue
	private int seatTypeId;
	private String seatTypeDesc;
	private float seatFare;
	
	public SeatType() {
		
	}

	public SeatType(int seatTypeId, String seatTypeDesc, float seatFare) {
		super();
		this.seatTypeId = seatTypeId;
		this.seatTypeDesc = seatTypeDesc;
		this.seatFare = seatFare;
	}

	public int getSeatTypeId() {
		return seatTypeId;
	}

	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}

	public String getSeatTypeDesc() {
		return seatTypeDesc;
	}

	public void setSeatTypeDesc(String seatTypeDesc) {
		this.seatTypeDesc = seatTypeDesc;
	}

	public float getSeatFare() {
		return seatFare;
	}

	public void setSeatFare(float seatFare) {
		this.seatFare = seatFare;
	}

	

}
