package com.ssafy.tennis.model.dao;

import java.util.List;

import com.ssafy.tennis.model.dto.Result;
import com.ssafy.tennis.model.dto.User;

public interface UserDao {
	List<User> selectMale();
	List<User> selectFemale();
	int signUp(User user);
	User logIn(User user);
	User selectOne(String user_Id);
	List<User> searchUser(String search);
	int user1Rate(User user);
	int user2Rate(User user);
	User searchSelect(User user);
	User checkPhone(String phone); 
	int updatePass(User user);
}
