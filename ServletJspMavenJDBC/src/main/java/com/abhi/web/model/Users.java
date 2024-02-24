package com.abhi.web.model;

public class Users {

	private int iD;
	private String userName;
	private String password;
	private String userEmail;
	private String userPhoneNo;
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
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
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhoneNo() {
		return userPhoneNo;
	}
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}
	@Override
	public String toString() {
		return "Users [iD=" + iD + ", userName=" + userName + ", password=" + password + ", userEmail=" + userEmail
				+ ", userPhoneNo=" + userPhoneNo + "]";
	}
}
