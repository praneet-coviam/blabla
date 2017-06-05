package com.coviam.blabla.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specs")
public class Specification {

	@Id
	@Column(name = "spec_id")
	int specId;
	
	@Column(name = "spec_name")
	String specName;
	
}
