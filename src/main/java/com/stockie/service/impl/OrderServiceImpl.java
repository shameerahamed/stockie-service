package com.stockie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockie.dao.OrderDao;
import com.stockie.model.Order;
import com.stockie.service.CustomerService;
import com.stockie.service.OrderService;
import com.stockie.service.ProductService;
import com.stockie.service.StockieAbstractService;

@Service("orderService")
public class OrderServiceImpl extends StockieAbstractService implements OrderService {

	@Autowired
	CustomerService customerService;

	@Autowired
	ProductService productService;

	@Autowired
	OrderDao orderDao;

	public void addOrder(Order order) {
		this.orderDao.addOrder(order);
		// logger.info("OrderId " + orderBean.getOrderId());
	}

	public List<Order> listOrders() {
		return orderDao.listOrders();
	}

	public Order getOrder(int orderId) {
		return orderDao.getOrder(orderId);
	}
	
	public Order loadOrder(int orderId) {
		return orderDao.loadOrder(orderId);
	}

	public void deleteOrder(int orderId) {
		orderDao.deleteOrder(orderId);
	}

	/*private List<OrderBean> prepareOrdListBean(List<Order> orders) {
		List<OrderBean> beans = null;
		if (orders != null && !orders.isEmpty()) {
			beans = new ArrayList<OrderBean>();
			for (Order order : orders) {
				beans.add(prepareOrderBean(order));
			}
		}
		return beans;
	}

	private Order prepareOrderModel(OrderBean orderBean) {
		Order order = new Order();
		order.setOrderId(orderBean.getOrderId());

		CustomerBean customerBean = customerService.getCustomer(orderBean.getCustomerId());
		order.setCustomer(customerService.prepareModel(customerBean));
		customerBean.setCustId(orderBean.getCustomerId());

		order.setOrderDate(orderBean.getOrderDate());
		order.setDiscount(orderBean.getDiscount());
		order.setSubTotal(orderBean.getSubTotal());
		order.setStatus(orderBean.getStatus());
		order.setTax(orderBean.getTax());
		order.setOldBalance(orderBean.getOldBalance());
		order.setNetAmount(orderBean.getNetAmount());
		order.setTotalAmount(orderBean.getTotalAmount());		
		order.setOrderItems(prepareOrdItemListModel(orderBean.getOrderItems()));

		return order;
	}

	private Set<OrderItem> prepareOrdItemListModel(Set<OrderItemBean> orderItems) {
		Set<OrderItem> items = null;
		if (((orderItems != null ? 1 : 0) & (orderItems.isEmpty() ? 0 : 1)) != 0) {
			items = new LinkedHashSet<OrderItem>();
			for (OrderItemBean orderItemBean : orderItems) {
				if (orderItemBean.getProductId() != null) {
					items.add(prepareOrderItemModel(orderItemBean));
				}
			}
		}
		return items;
	}

	private OrderItem prepareOrderItemModel(OrderItemBean orderItemBean) {
		OrderItem orderItem = new OrderItem();
		orderItem.setId(orderItemBean.getId());
		// orderItem.setOrder(prepareOrderModel(orderItemBean.getOrderBean()));

		ProductBean productBean = productService.getProduct(orderItemBean.getProductId());
		productBean.setProdId(orderItemBean.getProductId());
		orderItem.setProduct(productService.prepareModel(productBean));
		orderItem.setQuantity(orderItemBean.getQuantity());
		orderItemBean.setAmount(Float.valueOf(
				(float) orderItemBean.getQuantity().longValue() * Float.parseFloat(orderItemBean.getUnitCost())));
		orderItem.setAmount(orderItemBean.getAmount());
		return orderItem;
	}

	private Set<OrderItemBean> prepareOrdItemListBean(Set<OrderItem> list) {
		Set<OrderItemBean> beans = null;
		if (list != null && !list.isEmpty()) {
			beans = new LinkedHashSet<OrderItemBean>();
			for (OrderItem orderItem : list) {
				beans.add(prepareOrderItemBean(orderItem));
			}
		}
		return beans;
	}

	private OrderBean prepareOrderBean(Order order) {
		OrderBean orderBean = new OrderBean();
		orderBean.setOrderId(order.getOrderId());
		String formattedDate = order.getOrderDate();
		try {
			formattedDate = DateUtil.getFormattedDate(formattedDate);
		} catch (ParseException e) {
			e.printStackTrace();
			formattedDate = order.getOrderDate();
		}
		orderBean.setOrderDate(order.getOrderDate());
		orderBean.setCustomerBean(this.customerService.prepareBean(order.getCustomer()));
		orderBean.setCustomerId(order.getCustomer().getCustId());
		orderBean.setTax(order.getTax());
		orderBean.setDiscount(order.getDiscount());
		orderBean.setSubTotal(order.getSubTotal());
		orderBean.setStatus(order.getStatus());
		orderBean.setOldBalance(order.getOldBalance());
		orderBean.setNetAmount(order.getNetAmount());
		orderBean.setTotalAmount(order.getTotalAmount());
		orderBean.setOrderItems(prepareOrdItemListBean(order.getOrderItems()));
		return orderBean;
	}

	private OrderItemBean prepareOrderItemBean(OrderItem orderItem) {
		OrderItemBean bean = new OrderItemBean();
		bean.setId(orderItem.getId());
		// bean.setOrderBean(prepareOrderBean(orderItem.getOrder()));
		bean.setProductBean(productService.prepareBean(orderItem.getProduct()));
		bean.setQuantity(orderItem.getQuantity());
		bean.setAmount(orderItem.getAmount());
		return bean;
	}*/

	public void updateOrderPay(Order order) {
		/*Order order = this.loadOrder(order.getOrderId());
		order.setCcType(orderBean.getCcType());
		order.setPayDate(orderBean.getPayDate());
		order.setPayType(orderBean.getPayType());
		order.setStatus(orderBean.getStatus());		
		order.setRetChange(orderBean.getRetChange());
		order.setReceivedAmt(orderBean.getReceivedAmt());
		order.setModifiedTs(orderBean.getCurrentTimeStamp());
		
		this.updateOrder(order); */
	}
	
	public void updateOrder (Order order) {
		orderDao.updateOrder(order);
	}

}
