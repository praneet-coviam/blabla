package com.coviam.blabla.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_merchant")
public class ProductMerchant {

	 @EmbeddedId
	 ProdMerchGroupId prodMerchGroupId;
	 
	 @Column(name = "price")
	 Float price;
	 
	 @Column(name = "stock")
	 long stock;
	 
	 @Column(name = "score")
	 long score;

	public ProdMerchGroupId getProdMerchGroupId() {
		return prodMerchGroupId;
	}

	public void setProdMerchGroupId(ProdMerchGroupId prodMerchGroupId) {
		this.prodMerchGroupId = prodMerchGroupId;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
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
		return "ProductMerchant [prodMerchGroupId=" + prodMerchGroupId + ", price=" + price + ", stock=" + stock
				+ ", score=" + score + "]";
	}
}
