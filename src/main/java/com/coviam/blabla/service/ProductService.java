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
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Product>) pr.findAll();
	}

	@Override
	public List<Product> findProduct(String query) {
		// TODO Auto-generated method stub
		return pr.findByProductCategory(query);
	}

	@Override
<<<<<<< HEAD
	public Product getProduct(int productCode) {
		// TODO Auto-generated method stub
		return pr.findByProductCode(productCode);
=======
	public ProductMerchant findAndOrder(int pCode, int mId) {
		// TODO Auto-generated method stub
		return pmr.findByProductCodeAndMerchantId(pCode, mId);
>>>>>>> 9eff2d342d75e30c08fd1b63d7b77175e05d8e25
	}

}
