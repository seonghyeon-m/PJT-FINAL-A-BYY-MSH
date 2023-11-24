package com.ssafy.tennis.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.tennis.model.dao.ResultDao;
import com.ssafy.tennis.model.dao.UserDao;
import com.ssafy.tennis.model.dto.Result;
import com.ssafy.tennis.model.dto.User;

@Service
public class ResultServiceImpl implements ResultService {
	@Autowired
	private ResultDao resultDao;
	@Override
	public List<Result> finishMatch(String user1) {
		// TODO Auto-generated method stub
		return resultDao.finishMatch(user1);
	}
	@Override
	public Result matchNow(String user1) {
		// TODO Auto-generated method stub
		return resultDao.matchNow(user1);
	}
	@Override
	public void updateMatch(Result result) {
		System.out.println(result);
		resultDao.updateMatch(result);
	}
	@Override
	public int insertMatch(Result result) {
		// TODO Auto-generated method stub
		return resultDao.insertMatch(result);
	}
	@Override
	public List<Result> nowUserPast(Result result) {
		// TODO Auto-generated method stub
		return resultDao.nowUserPast(result);
	}
	@Override
	public void matchEnd(Result result) {
		resultDao.matchEnd(result);
		
	}



}
