package com.coviam.blabla.entity;


public class ProductAndMerchant {

	private Product product;
	private ProductMerchant productmerchant;
	
	public ProductAndMerchant(Product product, ProductMerchant productmerchant) {
		super();
		this.product = product;
		this.productmerchant = productmerchant;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductMerchant getProductmerchant() {
		return productmerchant;
	}

	public void setProductmerchant(ProductMerchant productmerchant) {
		this.productmerchant = productmerchant;
	}

	@Override
	public String toString() {
		return "ProductAndMerchant [product=" + product + ", productmerchant=" + productmerchant + "]";
	}
	
	
	
}
