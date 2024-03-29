package com.stockie.model;

// default package
// Generated Jun 25, 2017 1:53:14 PM by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Order implements java.io.Serializable {

	private int orderId;
	private Customer customer;
	private Date orderDate;
	private BigDecimal discount;
	private String status;
	private Date createdTs;
	private Date modifiedTs;
	private String notes;
	private String payType;
	private String ccType;
	private BigDecimal totalAmount;
	private BigDecimal changeReturn;
	private Date paymentDate;
	private Double netAmount;
	private Double oldBalance;
	private Double subTotal;
	private Long tax;
	private BigDecimal receivedAmount;
	private Set orderItems = new HashSet(0);
	private Set orderPayments = new HashSet(0);

	public Order() {
	}

	public Order(int orderId) {
		this.orderId = orderId;
	}

	public Order(int orderId, Customer customer, Date orderDate, BigDecimal discount, String status, Date createdTs,
			Date modifiedTs, String notes, String payType, String ccType, BigDecimal totalAmount,
			BigDecimal changeReturn, Date paymentDate, Double netAmount, Double oldBalance, Double subTotal, Long tax,
			BigDecimal receivedAmount, Set orderItems,Set orderPayments) {
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.discount = discount;
		this.status = status;
		this.createdTs = createdTs;
		this.modifiedTs = modifiedTs;
		this.notes = notes;
		this.payType = payType;
		this.ccType = ccType;
		this.totalAmount = totalAmount;
		this.changeReturn = changeReturn;
		this.paymentDate = paymentDate;
		this.netAmount = netAmount;
		this.oldBalance = oldBalance;
		this.subTotal = subTotal;
		this.tax = tax;
		this.receivedAmount = receivedAmount;
		this.orderItems = orderItems;
		this.orderPayments = orderPayments;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedTs() {
		return this.createdTs;
	}

	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}

	public Date getModifiedTs() {
		return this.modifiedTs;
	}

	public void setModifiedTs(Date modifiedTs) {
		this.modifiedTs = modifiedTs;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getCcType() {
		return this.ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getChangeReturn() {
		return this.changeReturn;
	}

	public void setChangeReturn(BigDecimal changeReturn) {
		this.changeReturn = changeReturn;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Double getNetAmount() {
		return this.netAmount;
	}

	public void setNetAmount(Double netAmount) {
		this.netAmount = netAmount;
	}

	public Double getOldBalance() {
		return this.oldBalance;
	}

	public void setOldBalance(Double oldBalance) {
		this.oldBalance = oldBalance;
	}

	public Double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Long getTax() {
		return this.tax;
	}

	public void setTax(Long tax) {
		this.tax = tax;
	}

	public BigDecimal getReceivedAmount() {
		return this.receivedAmount;
	}

	public void setReceivedAmount(BigDecimal receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public Set getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(Set orderItems) {
		this.orderItems = orderItems;
	}

	public Set getOrderPayments() {
		return this.orderPayments;
	}

	public void setOrderPayments(Set orderPayments) {
		this.orderPayments = orderPayments;
	}

}
