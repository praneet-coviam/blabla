package com.coviam.blabla.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.coviam.blabla.entity.ProductMerchant;

public interface ProductMerchantRepository extends CrudRepository<ProductMerchant, String> {

	public List<ProductMerchant> findByProductCodeAndMerchantIdOrderByScore(int productCode, int merchantId);
	public List<ProductMerchant> findByProductCode(int productCode);
}