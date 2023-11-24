package com.ssafy.tennis.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.tennis.model.dao.WaitDao;
import com.ssafy.tennis.model.dto.Wait;

@Service
public class WaitServiceImpl implements WaitService {
	@Autowired
	private WaitDao waitDao;
	@Override
	public int sendWait(Wait wait) {
		System.out.println(wait);
		return waitDao.sendWait(wait);
	}

	@Override
	public void acceptWait(Wait wait) {
		waitDao.acceptWait(wait);
		
	}

	@Override
	public void deleteWait(String accept) {
		waitDao.deleteWait(accept);
		
	}

	@Override
	public List<Wait> acceptRes(String acceptId) {
		// TODO Auto-generated method stub
		return waitDao.acceptRes(acceptId);
	}

	@Override
	public List<Wait> sendReq(String sendId) {
		// TODO Auto-generated method stub
		return waitDao.sendReq(sendId);
	}

	@Override
	public void matchStart(Wait wait) {
		// TODO Auto-generated method stub
		waitDao.matchStart(wait);
	}

	@Override
	public void declineWait(String sender) {
		waitDao.declineWait(sender);
		
	}

	
}
