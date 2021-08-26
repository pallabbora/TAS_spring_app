package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author Pallavi
 * @version 11.0.12
 *
 */
@Entity

public class LoginCredentials {

	
	@Id
	private String emailId;
	private String password;
	private String designation;
	public LoginCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param emailId set the emailId from user
	 * @param password set the password from user
	 * @param designation set designation of the user
	 */
	public LoginCredentials(String emailId, String password, String designation) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.designation = designation;
	}


	/**
	 * @return emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	
	
	/**
	 * @param emailId set the emailId for LoginCredentials
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	
	
	/**
	 * @param password set the password for LoginCredentials
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	/**
	 * @return designation
	 */
	public String getDesignation() {
		return designation;
	}
	
	/**
	 * @param designation set the designation for LoginCredentials
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	/**
	 *Returns string representation of the object
	 */
	@Override
	public String toString() {
		return "LoginCredentials [emailId=" + emailId + ", password=" + password + ", designation="
				+ designation + "]";
	}

	

}
