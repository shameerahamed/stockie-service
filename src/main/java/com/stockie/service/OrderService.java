package com.stockie.service;

import java.util.List;

import com.stockie.model.Order;

public interface OrderService {

	public void addOrder(Order orderBean);

	public List<Order> listOrders();
	
	public Order getOrder(int id);
	
	public void deleteOrder(int id);

	public void updateOrderPay(Order orderBean);

	public Order loadOrder(int orderId);

	public void updateOrder(Order order);
}
