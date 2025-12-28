package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="sales")
public class SalesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer saleid;
	
	@ManyToOne
	@JoinColumn(name = "shopid")
	private ShopEntity shop;
	
	@ManyToOne
	@JoinColumn(name = "productid")
	private ProductEntity product;
	
	private String customername;
	private String customeraddress;
	private String customeremail;
	public Integer getSaleid() {
		return saleid;
	}
	public void setSaleid(Integer saleid) {
		this.saleid = saleid;
	}
	public ShopEntity getShop() {
		return shop;
	}
	public void setShop(ShopEntity shop) {
		this.shop = shop;
	}
	public ProductEntity getProduct() {
		return product;
	}
	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public String getCustomeremail() {
		return customeremail;
	}
	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}
	
	
	public SalesEntity(Integer saleid, ShopEntity shop, ProductEntity product, String customername,
			String customeraddress, String customeremail) {
		super();
		this.saleid = saleid;
		this.shop = shop;
		this.product = product;
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.customeremail = customeremail;
	}
	public SalesEntity() {
		super();
	}
	
	

}
