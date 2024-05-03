package com.springboot.di.app.springbootdi.repositories;

import java.util.List;

import com.springboot.di.app.springbootdi.model.Product;

public interface ProductRepository {

    List<Product> findAll();

    Product findById(Long id);

}