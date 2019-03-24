package com.stockie.model;

// default package
// Generated Jun 25, 2017 1:53:14 PM by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;

/**
 * OrderItems generated by hbm2java
 */
public class OrderItem implements java.io.Serializable {

	private int id;
	private Order orders;
	private Product product;
	private BigDecimal amount;
	private Integer quantity;

	public OrderItem() {
	}

	public OrderItem(int id) {
		this.id = id;
	}

	public OrderItem(int id, Order orders, Product product, BigDecimal amount, Integer quantity) {
		this.id = id;
		this.orders = orders;
		this.product = product;
		this.amount = amount;
		this.quantity = quantity;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Order getOrders() {
		return this.orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}