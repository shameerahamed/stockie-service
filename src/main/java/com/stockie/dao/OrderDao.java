package com.stockie.dao;

import java.util.List;

import com.stockie.model.Order;

public interface OrderDao {
	public void addOrder(Order order);

	public List<Order> listOrders();
	
	public Order getOrder(int orderId);
	
	public void deleteOrder(int orderId);

	public Order loadOrder(int orderId);

	public void updateOrder(Order order);
}
