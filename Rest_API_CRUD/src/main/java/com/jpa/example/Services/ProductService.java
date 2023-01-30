package com.jpa.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.example.model.Product;
import com.jpa.example.repositeries.Produt_Repos;

@Service
public class ProductService {
	
	@Autowired
	Produt_Repos repo;
	
	public List<Product> getAllProducts()
	{
		return repo.findAll();
	}
}
