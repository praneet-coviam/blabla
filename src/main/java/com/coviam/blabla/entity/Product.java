package com.coviam.blabla.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Product")
public class Product {
	
	@Id
	@Column (name = "product_code")
	private int productCode;
	
	@Column (name = "product_name")
	private String productName;
	 
	@Column (name = "product_usp")
	private String productUsp;
	
	@Column (name = "product_category")
	private String productCategory;
	

	@Column (name = "product_desc")
	private String productDesc;
	
	@Column (name = "product_brand")
	private String productBrand;
	
	@Column (name = "product_image")
	private String productImage;
	
	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductUsp() {
		return productUsp;
	}

	public void setProductUsp(String productUsp) {
		this.productUsp = productUsp;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productUsp=" + productUsp
				+ ", productCategory=" + productCategory + ", productDesc=" + productDesc + ", productBrand="
				+ productBrand + ", productImage=" + productImage + "]";
	}
	
}
