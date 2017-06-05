package com.coviam.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.coviam.order.dto.OrderAndItems;
import com.coviam.order.entity.Order;
import com.coviam.order.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	OrderService orderservice;
	
	@RequestMapping(value = "/orders/checkout", method = RequestMethod.POST)
	
	public boolean saveOrder(OrderAndItems orderanditems){
		
		Order savedOrder = orderservice.saveOrder(orderanditems);
		long orderId = savedOrder.getOrderId();
		orderservice.saveOrderItems(orderanditems, orderId);
		orderservice.setMerchantRating(orderanditems.getMerchantRating());
		return true;
		
	}

	

}
