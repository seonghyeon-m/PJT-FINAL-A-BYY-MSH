package com.ssafy.tennis.model.service;

import java.util.List;

import com.ssafy.tennis.model.dto.Result;

public interface ResultService {
	int insertMatch(Result result);
	List<Result> finishMatch(String user1);
	Result matchNow(String user1);
	void updateMatch(Result result);
	List<Result> nowUserPast(Result result);
	void matchEnd(Result result);
}
