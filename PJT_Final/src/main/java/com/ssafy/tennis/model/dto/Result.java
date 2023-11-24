package com.ssafy.tennis.model.dto;

import java.util.Date;

public class Result {
	private int id;
	private String user1;
	private String user2;
	private Date matchDate;
	private String user1Phone;
	private String user2Phone;
	private String user1Name;
	private String user2Name;
	private Date fDate;
	private String result;
	public Result() {
		// TODO Auto-generated constructor stub
	}
	
	public Result(int id, String user1, String user2, Date matchDate, String user1Phone, String user2Phone,
			String user1Name, String user2Name, Date fDate, String result) {
		super();
		this.id = id;
		this.user1 = user1;
		this.user2 = user2;
		this.matchDate = matchDate;
		this.user1Phone = user1Phone;
		this.user2Phone = user2Phone;
		this.user1Name = user1Name;
		this.user2Name = user2Name;
		this.fDate = fDate;
		this.result = result;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser1() {
		return user1;
	}
	public void setUser1(String user1) {
		this.user1 = user1;
	}
	public String getUser2() {
		return user2;
	}
	public void setUser2(String user2) {
		this.user2 = user2;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	public Date getfDate() {
		return fDate;
	}
	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getUser1Phone() {
		return user1Phone;
	}

	public void setUser1Phone(String user1Phone) {
		this.user1Phone = user1Phone;
	}

	public String getUser2Phone() {
		return user2Phone;
	}

	public void setUser2Phone(String user2Phone) {
		this.user2Phone = user2Phone;
	}

	public String getUser1Name() {
		return user1Name;
	}

	public void setUser1Name(String user1Name) {
		this.user1Name = user1Name;
	}

	public String getUser2Name() {
		return user2Name;
	}

	public void setUser2Name(String user2Name) {
		this.user2Name = user2Name;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", user1=" + user1 + ", user2=" + user2 + ", matchDate=" + matchDate
				+ ", user1Phone=" + user1Phone + ", user2Phone=" + user2Phone + ", user1Name=" + user1Name
				+ ", user2Name=" + user2Name + ", fDate=" + fDate + ", result=" + result + "]";
	}
	
	
}
