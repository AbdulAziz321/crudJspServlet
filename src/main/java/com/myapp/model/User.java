package com.myapp.model;

public class User {

	private int userId;
	private String username;
	private String email;
	private long mobileNo;
	private String address;
	private String city;
	private String panNo;
	public User() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", address=" + address + ", city=" + city + ", panNo=" + panNo + ", getUserId()=" + getUserId()
				+ ", getUsername()=" + getUsername() + ", getEmail()=" + getEmail() + ", getMobileNo()=" + getMobileNo()
				+ ", getAddress()=" + getAddress() + ", getCity()=" + getCity() + ", getPanNo()=" + getPanNo()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
