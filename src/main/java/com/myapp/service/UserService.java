package com.myapp.service;

import java.util.List;

import com.myapp.model.User;

public interface UserService {

	public int addUser(User user);
	List<User>getListUser();
	public int deleteUser(int userId);
	public int updateUser(User user);
}
