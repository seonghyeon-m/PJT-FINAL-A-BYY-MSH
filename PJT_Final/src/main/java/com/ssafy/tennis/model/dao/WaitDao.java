package com.ssafy.tennis.model.dao;

import java.util.List;

import com.ssafy.tennis.model.dto.Wait;

public interface WaitDao {
	int sendWait(Wait wait);
	int acceptWait(Wait wait);
	int deleteWait(String accept);
	Wait selectWait(String accept);
	List<Wait> acceptRes(String acceptId);
	List<Wait> sendReq(String sendId);
	int matchStart(Wait wait);
	int declineWait(String sender);
		
}
