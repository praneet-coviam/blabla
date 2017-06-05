package com.coviam.blabla.dao;


import org.springframework.data.repository.CrudRepository;

import com.coviam.blabla.entity.ProductMerchant;

public interface ProductMerchantRepository extends CrudRepository<ProductMerchant, String>{

	public ProductMerchant findByProductCodeAndMerchantId(int productCode, int merchantId);
	
}