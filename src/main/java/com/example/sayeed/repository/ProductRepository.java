package com.example.sayeed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sayeed.entity.Product;

public interface ProductRepository extends JpaRepository <Product, Integer>{

}
