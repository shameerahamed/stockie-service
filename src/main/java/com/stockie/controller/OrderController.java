package com.stockie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.stockie.model.Order;
import com.stockie.service.OrderService;

@Controller
public class OrderController {
private static final Logger logger = Logger.getLogger("OrderController");
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/order", method = RequestMethod.GET)
	public ResponseEntity<List<Order>> listOrders() {
		List<Order> orders = orderService.listOrders();
		
		if (orders == null || orders.isEmpty()) {
			return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/order/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Order> deleteOrder(@PathVariable("id") int id) {
		logger.info("Fetching & Deleting Order with id " + id);
 
        Order orderBean = orderService.getOrder(id);
        if (orderBean == null) {
        	logger.info("Unable to delete. Order with id " + id + " not found");
            return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
        }
 
        orderService.deleteOrder(id);
        return new ResponseEntity<Order>(HttpStatus.NO_CONTENT);
    } 

	@RequestMapping(value = "/addOrder", method = RequestMethod.GET)
	public ModelAndView addOrder(@ModelAttribute("command")  Order order,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("orders",  orderService.listOrders());
		
		Order order2 = new Order();
		/*if (order2.getOrderItems() != null) {
			order2.getOrderItems().addAll(Collections.nCopies(5, new OrderItemBean()));
		}*/
		
		//productMap(model);
		model.put("order", order2);
		
		return new ModelAndView("addOrder", model);
	}
	
	@RequestMapping(value = "/viewOrder", method = RequestMethod.GET)
	public ModelAndView viewOrder(@RequestParam("id") int orderId) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("order", orderService.getOrder(orderId));
		model.put("orders",  orderService.listOrders());
		
		return new ModelAndView("viewOrder", model);
	}
	
	@RequestMapping(value = "/printOrder", method = RequestMethod.GET)
	public ModelAndView printOrder(@RequestParam("id") int orderId) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("order", orderService.getOrder(orderId));
		model.put("orders",  orderService.listOrders());
		model.put("screen", "print");
		
		return new ModelAndView("printOrder", model);
	}
	
/*	@RequestMapping(value = "/editOrder", method = RequestMethod.GET)
	public ModelAndView editOrder(@ModelAttribute("command")  OrderBean orderBean,
			@RequestParam("id") Long orderId) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("order", orderService.getOrder(orderId));
		model.put("orders",  orderService.listOrders());
		
		OrderBean orderBean2 = new OrderBean();
		if (orderBean2.getOrderItems() != null) {
			orderBean2.getOrderItems().addAll(Collections.nCopies(5, new OrderItemBean()));
		}
		
		List<CustomerBean> customers = customerService.listCustomers();		
		model.put("customers", customers);
		
		productMap(model);
		
		return new ModelAndView("addOrder", model);
	}*/
	
	@RequestMapping(value = "/sellOrder", method = RequestMethod.GET)
	public ModelAndView sellOrder() {
		Map<String, Object> model = new HashMap<String, Object>();		
		/*LayoutBean layoutBean = layoutService.getLayout(Long.valueOf(2));*/
		
		//productMap(model);
		/*model.put("layout", layoutBean);*/
		//model.put("orders",  orderService.listOrders());
		
		return new ModelAndView("sellOrder", model);
	}
 
	@RequestMapping(value="/saveOrder", method=RequestMethod.POST)
	@ResponseBody
	public int sync(@RequestBody Order order) { 
		order.setStatus("UNPAID");
		//orderBean.setOrderDate(orderBean.getCurrentTimeStamp());
		this.orderService.addOrder(order);
		logger.info("OrderId" + order.getOrderId());
		return order.getOrderId();
	}
	
	@RequestMapping(value="/payOrder", method = RequestMethod.POST)
	@ResponseBody
	public int payOrder(@RequestBody Order order) {
		order.setStatus("PAID");
		//orderBean.setPayDate(orderBean.getCurrentTimeStamp());
		this.orderService.updateOrderPay(order);

		logger.info("OrderId" + order.getOrderId());
		return order.getOrderId();		
	}
}
