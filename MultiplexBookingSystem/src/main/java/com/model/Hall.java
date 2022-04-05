package com.model;
import javax.persistence.*;

@Entity
public class Hall {
	@Id
	@GeneratedValue
	private int HallId;
	private String HallDesc;
	private int TotalCapacity;
	
	public Hall() {
		
	}

	public int getHallId() {
		return HallId;
	}

	public void setHallId(int hallId) {
		HallId = hallId;
	}

	public String getHallDesc() {
		return HallDesc;
	}

	public void setHallDesc(String hallDesc) {
		HallDesc = hallDesc;
	}

	public int getTotalCapacity() {
		return TotalCapacity;
	}

	public void setTotalCapacity(int totalCapacity) {
		TotalCapacity = totalCapacity;
	}
	
	

}
