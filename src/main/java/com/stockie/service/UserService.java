package com.stockie.service;

import java.util.List;

import com.stockie.model.User;

public interface UserService {
	public void saveUser(User userBean);

	public List<User> listUsers();
	
	public User getUser(int id);
	
	public void deleteUser(int id);
	
	public User validateUser(User userBean) throws Exception;
}
