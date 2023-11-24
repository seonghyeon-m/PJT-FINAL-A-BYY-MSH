package com.ssafy.tennis.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.tennis.model.dao.UserDao;
import com.ssafy.tennis.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int signUp(User user) {
		return userDao.signUp(user);
	}

	@Override
	public User logIn(User user) {
		User tmp = userDao.logIn(user);
		System.out.println(user);
		System.out.println(tmp);
		if (tmp != null && tmp.getLoginId().equals(user.getLoginId())) {
			return tmp;
		}
		return null;
	}

	@Override
	public List<User> selectMale() {

		return userDao.selectMale();
	}
	
	@Override
	public List<User> selectFemale() {

		return userDao.selectFemale();
	}
	
	@Override
	public User selectOne(String user_Id) {
		// TODO Auto-generated method stub
		System.out.println(user_Id);
		return userDao.selectOne(user_Id);
	}

	@Override
	public List<User> searchUser(String search) {
		System.out.println(search);
		return userDao.searchUser(search);
	}

	@Override
	public void user1Rate(User user) {
		// TODO Auto-generated method stub
		userDao.user1Rate(user);
		
	}

	@Override
	public void user2Rate(User user) {
		// TODO Auto-generated method stub
		userDao.user2Rate(user);
	}

	@Override
	public User searchSelect(User user) {
		// TODO Auto-generated method stub
		return userDao.searchSelect(user);
	}

	@Override
	public User checkPhone(String phone) {
		// TODO Auto-generated method stub
		return userDao.checkPhone(phone);
	}

	@Override
	public void updatePass(User user) {
		userDao.updatePass(user);
		
	}

}
