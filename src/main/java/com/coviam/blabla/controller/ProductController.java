package com.coviam.blabla.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coviam.blabla.dto.ProductAndMerchant;
import com.coviam.blabla.entity.Product;
import com.coviam.blabla.entity.ProductMerchant;
import com.coviam.blabla.service.ProductMerchantServiceInterface;
import com.coviam.blabla.service.ProductServiceInterface;

@RestController
public class ProductController {

	@Autowired
	ProductServiceInterface ps;
	
	@Autowired
	ProductMerchantServiceInterface pms;
	
	@RequestMapping(value = "/")
	public List<Product> getMyProduct(){
		List<Product> p = ps.getAllProducts();
		return p;
	}
	
//	@RequestMapping(method= RequestMethod.POST)
//	public OrderItem getMyProduct(OrderAndItemDetails input){
//		
//		Order order = new Order();
//		order.setEmail(input.getEmail());
//		
//		save(order);
//		
//		Long id= order.getId();
//		OrderItem oItem = new OrderItem();
//		oItem.setOrderId(id);
//	
//		save(oItem);
//		
//		return oItem;
//		
//	}
//	
	
	@RequestMapping("/allproducts")
	public Iterable<Product> getProduct(){
		Iterable<Product> productList = ps.getAllProducts();
		return productList;
		
		}
	
	
	
	@RequestMapping("/category/{query}")
	public List<Product> getProductByCategory(@PathVariable("query") String query){
		
		List<Product> productList = ps.findProduct(query);
		return productList;
		
	}
	
	
	@RequestMapping("/product/{pCode}/{mId}")
	public ProductAndMerchant getOrderedProducts(@PathVariable("pCode") int pCode,@PathVariable("mId") int mId){
		
		List<ProductMerchant> productMerchantList = pms.getProductDetails(pCode, mId);
		Product productList = ps.getProduct(pCode);
		ProductAndMerchant productAndMerchantList = new ProductAndMerchant(productList, productMerchantList);		
		return  productAndMerchantList;
		
	}
	
	@RequestMapping("/product/{pCode}")
	public ProductAndMerchant getProductList(@PathVariable("pCode") int pCode){
		
		List<ProductMerchant> productMerchantList = pms.getMerchantDetails(pCode);
		Product productList = ps.getProduct(pCode);
		ProductAndMerchant productAndMerchantList = new ProductAndMerchant(productList, productMerchantList);		
		return  productAndMerchantList;
		
	}
	
	
	
}