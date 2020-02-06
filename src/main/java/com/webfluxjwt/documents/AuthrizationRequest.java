package com.webfluxjwt.documents;

public class AuthrizationRequest {
	
	private String userName;
	
	private String password;
	
	private String emailAddress;

	public String getUserName() {
		return userName; 
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	
	

}
