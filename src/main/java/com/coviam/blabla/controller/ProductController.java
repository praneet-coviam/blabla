package com.coviam.blabla.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.coviam.blabla.entity.Product;
import com.coviam.blabla.entity.ProductMerchant;
import com.coviam.blabla.service.ProductServiceInterface;

@RestController
public class ProductController {

	@Autowired
	ProductServiceInterface ps;
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/")
	public JSONObject getProduct(){
		JSONObject toReturn = new JSONObject();
		JSONArray productArray = new JSONArray();
		String category = "";
		
		Iterable<Product> productList = ps.getAllProducts();
		for(Product product : productList){
			JSONObject productJson = new JSONObject();
			productJson.put("code", product.getProductCode());
			productJson.put("name", product.getProductName());
			productJson.put("usp", product.getProductUsp());
			productJson.put("desc", product.getProductDesc());
			productJson.put("brand", product.getProductBrand());
			productJson.put("imageurl", product.getProductImage());
			category = product.getProductCategory();
			productArray.add(productJson);
		}
		toReturn.put(category,productArray);
		
		return toReturn;
//		ModelAndView modelAndView = new ModelAndView("home");
//		modelAndView.addObject("home", toReturn);
//		return modelAndView;
		}
	
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/category/{query}")
	public JSONObject getProductByCategory(@PathVariable("query") String query){

		JSONObject toReturn = new JSONObject();
		JSONObject productJson = new JSONObject();	
		JSONArray productArray = new JSONArray();
		String category = "";
		List<Product> productList = ps.findProduct(query);
		for(Product product : productList){
			
			productJson.put("code", product.getProductCode());
			productJson.put("name", product.getProductName());
			productJson.put("usp", product.getProductUsp());
			productJson.put("desc", product.getProductDesc());
			productJson.put("brand", product.getProductBrand());
			productJson.put("imageurl", product.getProductImage());
			category = product.getProductCategory();
			productArray.add(productJson);
		}
		toReturn.put(category,productArray);
		return toReturn;
		
	}
	
	
	@RequestMapping("/product/{pCode}/{mId}")
	public JSONObject getOrderedProducts(@PathVariable("pCode") int pCode,@PathVariable("mId") int mId){

		JSONObject toReturn = new JSONObject();
		JSONObject productJson = new JSONObject();	
		JSONArray productArray = new JSONArray();
		long category = 0;
		List<ProductMerchant> productMerchantList = ps.findAndOrder(pCode, mId);
		for(ProductMerchant productMerchant : productMerchantList){
			
			productJson.put("code", productMerchant.getProdMerchGroupId());
			productJson.put("name", productMerchant.getPrice());
			productJson.put("usp", productMerchant.getScore());
			productJson.put("desc", productMerchant.getStock());
			category = productMerchant.getScore();
			productArray.add(productJson);
		}
		toReturn.put(category,productArray);
		return toReturn;
		
	}
	
	
}