package com.springboot.di.app.springbootdi.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.di.app.springbootdi.model.Product;

@Repository("productUnic")
public class ProductRepositoryFoo implements ProductRepository{

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product("Tomate",1l,1000l));
    }

    @Override
    public Product findById(Long id) {
        return new Product("Tomate",1l,1000l);
    }

}
