package com.coviam.order.helper;

import java.util.ArrayList;
import java.util.List;

import com.coviam.order.dto.ItemDetail;
import com.coviam.order.dto.OrderAndItems;
import com.coviam.order.entity.Order;
import com.coviam.order.entity.OrderItem;


public class OrderItemHelper {

	public static Order createOrder(OrderAndItems orderanditems) {
		Order order = new Order();
		order.setEmailId(orderanditems.getEmailId());
		order.setDate(orderanditems.getDate());
		return order;
	}
	
	public static List<OrderItem> createOrderItem(OrderAndItems orderanditems, long orderId) {
		
		List<ItemDetail> itemdetaillist = orderanditems.getProductList();
		List<OrderItem> orderitemlist = new ArrayList<OrderItem>();
		for(ItemDetail itemdetail : itemdetaillist){
		OrderItem orderitem = new OrderItem();
		orderitem.setOrderId(orderId);
		orderitem.setProductId(itemdetail.getProductId());
		orderitem.setMerchantId(itemdetail.getMerchantId());
		orderitem.setQuantity(itemdetail.getQuantity());
		orderitem.setRating(itemdetail.getRating());
		orderitem.setReviews(itemdetail.getReviews());
		orderitemlist.add(orderitem);
		}
		return orderitemlist;
	}
}
