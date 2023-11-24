package com.ssafy.tennis.model.dto;

import java.util.Date;

public class Wait {
	private int id;
	private String receiver;
	private String sender;
	private boolean status;
	private boolean match;
	private Date mdate;
	private String user1Phone;
	private String user2Phone;
	private String receiverName;
	private String senderName;
	
	public Wait() {
		// TODO Auto-generated constructor stub
	}

	
	



	public Wait(int id, String receiver, String sender, boolean status, boolean match, Date mdate, String user1Phone,
			String user2Phone, String receiverName, String senderName) {
		super();
		this.id = id;
		this.receiver = receiver;
		this.sender = sender;
		this.status = status;
		this.match = match;
		this.mdate = mdate;
		this.user1Phone = user1Phone;
		this.user2Phone = user2Phone;
		this.receiverName = receiverName;
		this.senderName = senderName;
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






	public Date getMdate() {
		return mdate;
	}




	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}




	public String getReceiverName() {
		return receiverName;
	}




	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}




	public String getSenderName() {
		return senderName;
	}




	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isMatch() {
		return match;
	}

	public void setMatch(boolean match) {
		this.match = match;
	}






	@Override
	public String toString() {
		return "Wait [id=" + id + ", receiver=" + receiver + ", sender=" + sender + ", status=" + status + ", match="
				+ match + ", mdate=" + mdate + ", user1Phone=" + user1Phone + ", user2Phone=" + user2Phone
				+ ", receiverName=" + receiverName + ", senderName=" + senderName + "]";
	}


	

	
	
	
}
