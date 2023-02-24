package com.myapp.dao;

import java.util.List;

import com.myapp.model.User;

public interface UserDao {

	int addUser(User user);
	
	List<User>getListUser();
	
	int deleteUser(int userId);
	
	int updateUser(User user);
	
}
