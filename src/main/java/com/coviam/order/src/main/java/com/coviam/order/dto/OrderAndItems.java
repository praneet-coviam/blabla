package com.coviam.order.dto;

import java.util.Date;
import java.util.List;

public class OrderAndItems {
	
	private String emailId;
	
	private Date date;
	
	private float merchantRating;
	
	List<ItemDetail> productList;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getMerchantRating() {
		return merchantRating;
	}

	public void setMerchantRating(float merchantRating) {
		this.merchantRating = merchantRating;
	}

	public List<ItemDetail> getProductList() {
		return productList;
	}

	public void setProductList(List<ItemDetail> productList) {
		this.productList = productList;
	}
	
	

}
