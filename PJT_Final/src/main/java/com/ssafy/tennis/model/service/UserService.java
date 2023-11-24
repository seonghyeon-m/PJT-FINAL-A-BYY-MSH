package com.ssafy.tennis.model.service;

import java.util.List;

import com.ssafy.tennis.model.dto.User;

public interface UserService {
	List<User> selectMale();
	List<User> selectFemale();
	int signUp(User user);
	User logIn(User user);
	User selectOne(String user_Id);
	List<User> searchUser(String search);
	void user1Rate(User user);
	void user2Rate(User user);
	User searchSelect(User user);
	User checkPhone(String phone);
	void updatePass(User user);
}
