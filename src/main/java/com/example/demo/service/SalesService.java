package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SaleDTO;
import com.example.demo.entities.ProductEntity;
import com.example.demo.entities.SalesEntity;
import com.example.demo.entities.ShopEntity;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.SalesRepository;
import com.example.demo.repository.ShopRepository;

@Service
public class SalesService {
	
	@Autowired
	private SalesRepository sales;
	
	@Autowired
	private ShopRepository shops;
	
	@Autowired
	private ProductRepository products;
	
	
	public List<ProductEntity> findProducts(){
		return products.findAll();
	}
	
	public List<ShopEntity> findShops(){
		return shops.findAll();
	}
	
	public List<SalesEntity> findSales(){
		return sales.findAll();
	}
	
	public SalesEntity saveSales(SalesEntity saleObj) {
		sales.save(saleObj);
		return saleObj;
	}
	
	
	
//	public SaleDTO saveSalesusingDTO(SaleDTO sale) {
//		
//		SalesEntity saleObj = new SalesEntity();
//		ProductEntity prodObj = new ProductEntity();
//		ShopEntity shopObj = new ShopEntity();
//		
//		prodObj.setProductid(sale.getProductid());
//		shopObj.setShopid(sale.getShopid());
//		
//		saleObj.setProduct(prodObj);
//		saleObj.setShop(shopObj);
//		saleObj.setCustomeraddress(sale.getCustomeraddress());
//		saleObj.setCustomeremail(sale.getCustomeremail());
//		saleObj.setCustomername(sale.getCustomername());
//		sales.save(saleObj);
//		return sale;
//	}

}
