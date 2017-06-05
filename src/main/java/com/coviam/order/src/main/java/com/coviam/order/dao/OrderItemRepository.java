package com.coviam.order.dao;

import org.springframework.data.repository.CrudRepository;
import com.coviam.order.entity.Order;
import com.coviam.order.entity.OrderId;
import com.coviam.order.entity.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem, OrderId> {

}
