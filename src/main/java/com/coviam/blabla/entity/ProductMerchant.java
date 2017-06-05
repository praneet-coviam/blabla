package com.coviam.blabla.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_merchant")
public class ProductMerchant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "product_code")
	int productCode;
	
	@Column(name = "merchant_id")
	int merchantId;
	
	@Column(name = "price")
	float price;
	
	@Column(name = "stock")
	long stock;
	
	@Column(name = "score")
	long score;

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "ProductMerchant [productCode=" + productCode + ", merchantId=" + merchantId + ", price=" + price
				+ ", stock=" + stock + ", score=" + score + "]";
	}
	
	
	
}
