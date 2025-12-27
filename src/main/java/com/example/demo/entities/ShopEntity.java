package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "shops")
public class ShopEntity {
	
	
	
	@Id
	private Integer shopid;
	private String shopname;
	
	public Integer getShopid() {
		return shopid;
	}
	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public ShopEntity(Integer shopid, String shopname) {
		super();
		this.shopid = shopid;
		this.shopname = shopname;
	}
	
	public ShopEntity() {
		
	}
	
	

}
