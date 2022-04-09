package com.model;
import javax.persistence.*;

@Entity
public class Hall {
	@Id
	@GeneratedValue
	private int hallId;
	private String hallDesc;
	private int totalCapacity;
	
	public Hall() {
		
	}

	public Hall(int hallId, String hallDesc, int totalCapacity) {
		super();
		this.hallId = hallId;
		this.hallDesc = hallDesc;
		this.totalCapacity = totalCapacity;
	}

	public int getHallId() {
		return hallId;
	}

	public void setHallId(int hallId) {
		this.hallId = hallId;
	}

	public String getHallDesc() {
		return hallDesc;
	}

	public void setHallDesc(String hallDesc) {
		this.hallDesc = hallDesc;
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	
	

}
