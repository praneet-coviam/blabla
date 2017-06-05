package com.coviam.blabla.service;

<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 9eff2d342d75e30c08fd1b63d7b77175e05d8e25
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coviam.blabla.dao.ProductMerchantRepository;
import com.coviam.blabla.entity.ProductMerchant;

@Service
public class ProductMerchantService implements ProductMerchantServiceInterface{

	@Autowired
	ProductMerchantRepository pmr;
	
	@Override
<<<<<<< HEAD
	public List<ProductMerchant> getProductDetails(int productCode, int merchantId) {
		// TODO Auto-generated method stub
		List<ProductMerchant> productmerchantlist = pmr.findByProductCodeAndMerchantIdOrderByScore(productCode,merchantId);		
		return productmerchantlist;
	}

	@Override
	public List<ProductMerchant> getMerchantDetails(int productCode) {
		// TODO Auto-generated method stub
		List<ProductMerchant> productmerchantlist = (List<ProductMerchant>) pmr.findByProductCode(productCode);
=======
	public ProductMerchant getProductDetails(int productCode, int merchantId) {
		// TODO Auto-generated method stub
		ProductMerchant productmerchantlist = pmr.findByProductCodeAndMerchantId(productCode,merchantId);		
>>>>>>> 9eff2d342d75e30c08fd1b63d7b77175e05d8e25
		return productmerchantlist;
	}

}