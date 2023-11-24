package com.ssafy.tennis.model.service;

import java.util.List;

import com.ssafy.tennis.model.dto.User;
import com.ssafy.tennis.model.dto.Wait;

public interface WaitService {
	int sendWait(Wait wait);
	void acceptWait(Wait wait);
	void deleteWait(String accept);
	List<Wait> acceptRes(String acceptId);
	List<Wait> sendReq(String sendId);
	void matchStart(Wait wait);
	void declineWait(String sender);
}
