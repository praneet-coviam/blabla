package com.coviam.blabla.service;

import java.util.List;

import com.coviam.blabla.entity.Product;
import com.coviam.blabla.entity.ProductMerchant;

public interface ProductServiceInterface {

	public Iterable<Product> getAllProducts();
	public List<Product> findProduct(String query);
	public ProductMerchant findAndOrder(int pCode,int mId);
}