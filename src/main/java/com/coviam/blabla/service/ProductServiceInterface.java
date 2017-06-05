package com.coviam.blabla.service;

import java.util.List;

import com.coviam.blabla.entity.Product;

public interface ProductServiceInterface {

	public List<Product> getAllProducts();
	public List<Product> findProduct(String query);
<<<<<<< HEAD
	public Product getProduct(int productCode);
=======
	public ProductMerchant findAndOrder(int pCode,int mId);
>>>>>>> 9eff2d342d75e30c08fd1b63d7b77175e05d8e25
}