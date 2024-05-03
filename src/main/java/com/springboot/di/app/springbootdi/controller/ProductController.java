package com.springboot.di.app.springbootdi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.di.app.springbootdi.model.Product;
import com.springboot.di.app.springbootdi.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping()
    public List<Product> getProducts() {
        return service.getAllProducts();
    }
    
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable(value = "id") Long id) {
        return service.getProductById(id);
    }
    
}
