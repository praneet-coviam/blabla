package com.coviam.order.dao;

import org.springframework.data.repository.CrudRepository;
import com.coviam.order.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
