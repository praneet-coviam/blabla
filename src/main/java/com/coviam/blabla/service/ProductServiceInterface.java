package com.coviam.blabla.service;

import java.util.List;

import com.coviam.blabla.entity.Product;

public interface ProductServiceInterface {

	public List<Product> getAllProducts();
	public List<Product> findProduct(String query);
	public Product getProduct(int productCode);
}