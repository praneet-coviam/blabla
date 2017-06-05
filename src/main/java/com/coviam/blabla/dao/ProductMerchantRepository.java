package com.coviam.blabla.dao;


import org.springframework.data.repository.CrudRepository;
import com.coviam.blabla.entity.ProductMerchant;

public interface ProductMerchantRepository extends CrudRepository<ProductMerchant, String> {

<<<<<<< HEAD
	public List<ProductMerchant> findByProductCodeAndMerchantIdOrderByScore(int productCode, int merchantId);
	public List<ProductMerchant> findByProductCode(int productCode);
=======
	public ProductMerchant findByProductCodeAndMerchantId(int productCode, int merchantId);
	
>>>>>>> 9eff2d342d75e30c08fd1b63d7b77175e05d8e25
}