package com.jpa.example.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.example.model.Product;

public interface Produt_Repos extends JpaRepository<Product, Integer> {

}
