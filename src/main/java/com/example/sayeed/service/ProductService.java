package com.example.sayeed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sayeed.entity.Product;
import com.example.sayeed.repository.ProductRepository;

@Service
public class ProductService {
@Autowired	
private ProductRepository repository;
public Product getProductById;

//post
public List <Product> saveProducts (List <Product> products) {
 return repository.saveAll(products);
   }

//get
public List <Product> getProducts () {
	 return repository.findAll();
	   }
	
//delete
public String deleteProduct(int id) {
	repository.deleteById(id);
	return "Product Deleted"+id;
}
//update 
public Product updateProduct(Product product) {
Product existingProduct = repository.findById(product.getId()).orElse(null);
existingProduct.setName(product.getName());
existingProduct.setQuantity(product.getQuantity());
existingProduct.setPrice(product.getPrice());
   return repository.save(existingProduct);

}
}