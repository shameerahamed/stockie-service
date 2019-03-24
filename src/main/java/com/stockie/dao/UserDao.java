package com.stockie.dao;

import java.util.List;

import com.stockie.model.User;

/**
 * @author ShameerAhamed
 *
 */
public interface UserDao {
	public void saveUser(User user);

	public List<User> listUsers();

	public User getUser(int userId);

	public void deleteUser(int userId);

	public User validateUser(User user);
}
