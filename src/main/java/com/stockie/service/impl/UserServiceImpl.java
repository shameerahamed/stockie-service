package com.stockie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockie.dao.UserDao;
import com.stockie.model.User;
import com.stockie.service.StockieAbstractService;
import com.stockie.service.UserService;

@Service("userService")
public class UserServiceImpl extends StockieAbstractService implements UserService  {
	
	@Autowired
	private UserDao userDao;

	public void saveUser(User user) {
		userDao.saveUser(user);		
	}

	public List<User> listUsers() {
		return userDao.listUsers();
	}

	public User getUser(int userId) {
		return userDao.getUser(userId);
	}

	public void deleteUser(int userId) {
		userDao.deleteUser(userId);		
	}

	public User validateUser(User user) throws Exception {
		user = userDao.validateUser(user);
		
		
		return user;
	}
	
}
