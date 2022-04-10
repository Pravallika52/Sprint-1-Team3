package com.model;
import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Length;

@Entity
public class Users {
	@Id
	@GeneratedValue
	private int userId;
	@NotEmpty(message="Please Enter a Name")
	private String userName;
	@Email
	private String emailId;
	private double mobileNo;
	@Length(min=8,max=20)
	private String userPassword;
	@Length(min=8,max=20)
	private String userConfirmPassword;	
	private String userType;
	
	public Users() {
		
	}

	public Users(int userId, String userName, String emailId, double mobileNo, String userPassword,
			String userConfirmPassword, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.userPassword = userPassword;
		this.userConfirmPassword = userConfirmPassword;
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(double mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserConfirmPassword() {
		return userConfirmPassword;
	}

	public void setUserConfirmPassword(String userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}


















