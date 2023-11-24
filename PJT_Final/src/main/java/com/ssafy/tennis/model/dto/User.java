package com.ssafy.tennis.model.dto;

import java.util.Date;

public class User {
	
	private int ranking;
	private int id;
	private String name;
	private String loginId;
	private String pass;
	private String email;
	private String phone;
	private String gender;
	private int age;
	private String address;
	private Date regDate;
	private int rate;
	private boolean status;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	

	public User(int ranking, int id, String name, String loginId, String pass, String email, String phone, String gender,
			int age, String address, Date regDate, int rate, boolean status) {
		super();
		this.ranking = ranking;
		this.id = id;
		this.name = name;
		this.loginId = loginId;
		this.pass = pass;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.regDate = regDate;
		this.rate = rate;
		this.status = status;
	}



	@Override
	public String toString() {
		return "User [ranking=" + ranking + ", id=" + id + ", name=" + name + ", loginId=" + loginId + ", pass=" + pass
				+ ", email=" + email + ", phone=" + phone + ", gender=" + gender + ", age=" + age + ", address="
				+ address + ", regDate=" + regDate + ", rate=" + rate + ", status=" + status + "]";
	}



	public int getRanking() {
		return ranking;
	}



	public void setRanking(int ranking) {
		this.ranking = ranking;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
	}
	
	