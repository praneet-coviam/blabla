package com.coviam.blabla.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProdMerchGroupId {

	@Column(name = "product_code")
	int productCode;
	
	@Column(name = "merchant_id")
	int merchantId;
	
}
