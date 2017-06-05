package com.coviam.blabla.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coviam.blabla.dao.ProductRepository;
import com.coviam.blabla.entity.Product;

@Service
public class ProductService implements ProductServiceInterface{

	@Autowired
	ProductRepository pr;
	
//	@Autowired
//	ProductMerchantRepository pmr;
	
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
	public Product getProduct(int productCode) {
		// TODO Auto-generated method stub
		return pr.findByProductCode(productCode);
	}

}
