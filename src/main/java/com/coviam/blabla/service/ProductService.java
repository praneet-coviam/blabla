package com.coviam.blabla.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coviam.blabla.dao.ProductMerchantRepository;
import com.coviam.blabla.dao.ProductRepository;
import com.coviam.blabla.entity.Product;
import com.coviam.blabla.entity.ProductMerchant;

@Service
public class ProductService implements ProductServiceInterface{

	@Autowired
	ProductRepository pr;
	
	@Autowired
	ProductMerchantRepository pmr;
	
	@Override
	public Iterable<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public List<Product> findProduct(String query) {
		// TODO Auto-generated method stub
		return pr.findByProductCategory(query);
	}

	@Override
	public ProductMerchant findAndOrder(int pCode, int mId) {
		// TODO Auto-generated method stub
		return pmr.findByProductCodeAndMerchantId(pCode, mId);
	}

}
