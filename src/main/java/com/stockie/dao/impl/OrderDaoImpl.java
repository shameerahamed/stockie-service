package com.stockie.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.stockie.dao.OrderDao;
import com.stockie.dao.StockieAbstractDao;
import com.stockie.model.Order;

@Repository("orderDao")
public class OrderDaoImpl extends StockieAbstractDao implements OrderDao {

	public void addOrder(Order order) {
		persist(order);
	}

	public List<Order> listOrders() {
		Criteria cr = getSession().createCriteria(Order.class);
		cr.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		cr.addOrder(org.hibernate.criterion.Order.asc("orderId"));
		
		return (List<Order>) cr.list();
		
	}

	public Order getOrder(int orderId) {
		return (Order) getSession().get(Order.class,
				orderId);
	}

	public Order loadOrder(int orderId) {
		return (Order) getSession().load(Order.class,
				orderId);
	}

	public void deleteOrder(int orderId) {
		
		delete(getOrder(orderId));

	}

	public void updateOrder(Order order) {
		 getSession().saveOrUpdate(order);

	}

}
