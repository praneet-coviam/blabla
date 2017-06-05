package com.coviam.blabla.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coviam.blabla.dao.ProductMerchantRepository;
import com.coviam.blabla.entity.ProductMerchant;
import com.coviam.blabla.entity.ProductMerchantId;

@Service
public class ProductMerchantService implements ProductMerchantServiceInterface{

	@Autowired
	ProductMerchantRepository pmr;
	
	@Override
	public List<ProductMerchant> getProductDetails(int productCode, int merchantId) {
		// TODO Auto-generated method stub
		ProductMerchantId pmid = new ProductMerchantId(productCode,merchantId);
		List<ProductMerchant> productmerchantlist = pmr.findByProductCodeAndMerchantId(pmid);		
		return productmerchantlist;
	}

//	@Override
//	public List<ProductMerchant> getMerchantDetails(int productCode) {
//		// TODO Auto-generated method stub
//		List<ProductMerchant> productmerchantlist = (List<ProductMerchant>) pmr.findByProductCode(productCode);
//		return productmerchantlist;
//	}

}