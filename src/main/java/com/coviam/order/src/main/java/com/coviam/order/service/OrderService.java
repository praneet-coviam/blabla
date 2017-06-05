package com.coviam.order.service;

import java.util.List;

import com.coviam.order.dto.OrderAndItems;
import com.coviam.order.entity.Order;
import com.coviam.order.entity.OrderItem;


public interface OrderService {
	
	public Order saveOrder(OrderAndItems orderanditems);
	
	public void deleteOrder(long orderid);
	
	public Order getOrder(long orderId);
	
	public OrderItem saveOrderItems(OrderAndItems orderanditems, long orderId);
	
	public void setMerchantRating(float merchantRating);

}
