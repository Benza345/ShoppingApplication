package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SaleDTO;
import com.example.demo.entities.ProductEntity;
import com.example.demo.entities.SalesEntity;
import com.example.demo.entities.ShopEntity;
import com.example.demo.service.SalesService;

@RestController
@RequestMapping("shoppingApp")
@CrossOrigin(origins = "http://localhost:3000")
public class SalesController {
	
	@Autowired
	private SalesService salesService;
	
	@GetMapping("/products")
	public List<ProductEntity> getProducts(){
		return salesService.findProducts();
	}
	
	@GetMapping("/shops")
	public List<ShopEntity> getShops(){
		return salesService.findShops();
	}
	
	@GetMapping("/sales")
	public List<SalesEntity> getSales(){
		return salesService.findSales();
	}
	
	@PostMapping("/sales")
	public SalesEntity createSale(@RequestBody SalesEntity sale) {
		return salesService.saveSales(sale);
	}
	
	

}
