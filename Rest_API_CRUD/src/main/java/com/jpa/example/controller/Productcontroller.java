package com.jpa.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.example.Services.ProductService;
import com.jpa.example.model.Product;

@RestController
public class Productcontroller {
	
	@Autowired
	ProductService rep;
	
	@GetMapping("/products")
	public List<Product> getproduct()
	{
		return rep.getAllProducts();
	}
	
}
