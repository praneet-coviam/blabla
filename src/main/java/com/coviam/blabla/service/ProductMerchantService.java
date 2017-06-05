package com.coviam.blabla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coviam.blabla.dao.ProductMerchantRepository;
import com.coviam.blabla.entity.ProductMerchant;

@Service
public class ProductMerchantService implements ProductMerchantServiceInterface{

	@Autowired
	ProductMerchantRepository pmr;
	
	@Override
	public ProductMerchant getProductDetails(int productCode, int merchantId) {
		// TODO Auto-generated method stub
		ProductMerchant productmerchantlist = pmr.findByProductCodeAndMerchantId(productCode,merchantId);		
		return productmerchantlist;
	}

}