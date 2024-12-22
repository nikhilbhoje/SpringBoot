package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.repository.Product;

@Service
public class ProductService {
	
	List<Product> products = Arrays.asList(
			new Product(101,"IPhone", 100000),
			new Product(102,"Bajaj Fan", 2500),
			new Product(103,"Canon Camera", 20000));
	
	public List<Product> getProducts() {
		return products;
	}

}
