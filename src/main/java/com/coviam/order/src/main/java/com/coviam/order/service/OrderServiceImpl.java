package com.coviam.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coviam.order.dao.OrderItemRepository;
import com.coviam.order.dao.OrderRepository;
import com.coviam.order.dto.OrderAndItems;
import com.coviam.order.entity.Order;
import com.coviam.order.entity.OrderItem;
import com.coviam.order.helper.OrderItemHelper;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderrepository;
	@Autowired
	private OrderItemRepository orderitemrepository;
	
	@Override
	public Order saveOrder(OrderAndItems orderanditems) {
		Order order = OrderItemHelper.createOrder(orderanditems);
		Order savedOrder = orderrepository.save(order);
		return savedOrder;
		
	}
	

	@Override
	public OrderItem saveOrderItems(OrderAndItems orderanditems, long orderId) {
		List<OrderItem> orderitems = OrderItemHelper.createOrderItem(orderanditems, orderId);
		for(OrderItem orderitem : orderitems){
			OrderItem savedOrderItem = orderitemrepository.save(orderitem);
		}
		return null;
	}

	@Override
	public void deleteOrder(long orderId) {
		orderrepository.delete(orderId);
		
	}

	@Override
	public Order getOrder(long orderId) {
		Order order = orderrepository.findOne(orderId);
		return order;
	}


	@Override
	public void setMerchantRating(float merchantRating) {
		// TODO Auto-generated method stub
		
	}



	

}
