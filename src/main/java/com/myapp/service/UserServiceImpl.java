package com.myapp.service;

import java.util.List;

import com.myapp.dao.UserDao;
import com.myapp.dao.UserDaoImpl;
import com.myapp.model.User;

public class UserServiceImpl implements UserService {

	UserDao userDao=new UserDaoImpl();   
	
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	public List<User> getListUser() {
		// TODO Auto-generated method stub
		return userDao.getListUser();
	}

	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(userId);
	}

	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

}
