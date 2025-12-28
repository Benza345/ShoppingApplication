package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "products")
public class ProductEntity {
	
	@Id
	private Integer productid;
	private String productname;
	
	
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public ProductEntity(Integer productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
	}
	
	public ProductEntity() {
		
	}
	
	

}
