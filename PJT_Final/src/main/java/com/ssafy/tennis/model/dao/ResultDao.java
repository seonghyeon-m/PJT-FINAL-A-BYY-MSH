package com.ssafy.tennis.model.dao;

import java.util.List;

import com.ssafy.tennis.model.dto.Result;

public interface ResultDao {
	int insertMatch(Result result);
	List<Result> finishMatch(String user1);
	Result matchNow(String user1);
	int updateMatch(Result result);
	List<Result> nowUserPast(Result result);
	int matchEnd(Result result);
}
