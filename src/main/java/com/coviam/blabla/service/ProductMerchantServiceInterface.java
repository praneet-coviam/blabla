package com.coviam.blabla.service;

import java.util.List;

import com.coviam.blabla.entity.ProductMerchant;

public interface ProductMerchantServiceInterface {

	public List<ProductMerchant> getProductDetails(int productCode, int merchantId);
	public List<ProductMerchant> getMerchantDetails(int productCode);
}
