package com.stockie.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stockie.dao.StockieAbstractDao;
import com.stockie.dao.UserDao;
import com.stockie.model.User;

/**
 * @author ShameerAhamed
 *
 */
@Repository ("userDao")
public class UserDaoImpl extends StockieAbstractDao implements UserDao {
	
	public void saveUser(User user) {
		getSession().saveOrUpdate(user);		
	}

	public List<User> listUsers() {
		return (List<User>) getSession().createCriteria(User.class).list();
	}

	public User getUser(int userId) {
		return (User) getSession().get(User.class, userId);
	}

	public void deleteUser(int userId) {
		getSession().createQuery("DELETE FROM User WHERE userId = "+userId).executeUpdate();
	}

	public User validateUser(User user) {
		Query q = getSession().createQuery("from User where username = :username and password = :password");
		q.setString("username", user.getUserName());
		q.setString("password", user.getPassword());
		
		return (User)q.uniqueResult();
	}

}
