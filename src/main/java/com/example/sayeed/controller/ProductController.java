package com.example.sayeed.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sayeed.entity.Product;
import com.example.sayeed.service.ProductService;

@RestController
public class ProductController {
private ProductService service;

@PostMapping("/addProducts")	
public List <Product> addProducts(@RequestBody List <Product> products){	
	return service.saveProducts(products);
   }
@GetMapping("/product/{id}")
	public Product findProductById(int id) {
		return service.getProductById;

}

@PutMapping("/update")
public Product updateProduct(@RequestBody Product product ) {
 return service.updateProduct(product);	
 
}

@DeleteMapping
public String deleteProduct(int id) {
	return service.deleteProduct(id);
}

}








 










