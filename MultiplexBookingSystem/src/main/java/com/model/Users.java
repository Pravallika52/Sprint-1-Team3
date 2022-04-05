package com.model;
import javax.persistence.*;

@Entity
public class Users {
	@Id
	@GeneratedValue
	private int UserId;
	private String UserName;
	private char UserType;
	private int MobileNo;
	private String EmailId;
	
	public Users() {
		
	}
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public char getUserType() {
		return UserType;
	}
	public void setUserType(char userType) {
		UserType = userType;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	
	
}
