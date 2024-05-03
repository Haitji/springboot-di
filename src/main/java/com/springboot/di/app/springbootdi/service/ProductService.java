package com.springboot.di.app.springbootdi.service;

import java.util.List;

import com.springboot.di.app.springbootdi.model.Product;

public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

}