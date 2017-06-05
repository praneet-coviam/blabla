package com.coviam.order.entity;

import java.io.Serializable;

public class OrderId implements Serializable {
	 
	private long orderId;
	private long productId;
	private long merchantId;
	
	public OrderId(){
		
	}
	
	public OrderId(long orderId, long productId, long merchantId) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.merchantId = merchantId;
	}

	public long getOrderId() {
		return orderId;
	}

	public long getProductId() {
		return productId;
	}

	public long getMerchantId() {
		return merchantId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (merchantId ^ (merchantId >>> 32));
		result = prime * result + (int) (orderId ^ (orderId >>> 32));
		result = prime * result + (int) (productId ^ (productId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderId other = (OrderId) obj;
		if (merchantId != other.merchantId)
			return false;
		if (orderId != other.orderId)
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}
	
	
	
	
	
	

}
