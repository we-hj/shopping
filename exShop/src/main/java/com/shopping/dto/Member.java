package com.shopping.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Member {

//	CREATE TABLE shop_member (
//		userId		VARCHAR(20)		NOT NULL,
//		userPw		VARCHAR(16)		NOT NULL,
//		userName	VARCHAR(10)		NOT NULL,
//		birthday	DATE 			NOT NULL,
//		gender		CHAR(1) 		NOT NULL,
//		email		VARCHAR(50) 	NOT NULL,
//		phone		VARCHAR(20) 	NOT NULL,
//		userRegDate TIMESTAMP 		NOT NULL 	DEFAULT current_timestamp(),
//		PRIMARY KEY (userId)
//	)
	
	private String userId;
	private String userPw;
	private String userName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	
	private char gender;
	private String email;
	private String phone;
	private String userRegDate;
	
	
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserName() {
		return userName;
	}
	public Date getBirthday() {
		return birthday;
	}
	public char getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getUserRegDate() {
		return userRegDate;
	}
	

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setUserRegDate(String userRegDate) {
		this.userRegDate = userRegDate;
	}
	
}
