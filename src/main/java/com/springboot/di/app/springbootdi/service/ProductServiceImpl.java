package com.springboot.di.app.springbootdi.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.springboot.di.app.springbootdi.model.Product;
import com.springboot.di.app.springbootdi.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {


    private ProductRepository repositories;
    private Environment env;
    
    public ProductServiceImpl(@Qualifier("productRepositoryJson") ProductRepository repositories, Environment env) {
        this.repositories = repositories;
        this.env = env;
    }

    @Override
    public List<Product> getAllProducts() {
        return repositories.findAll().stream().map(p->{
            Double precioFinal = p.getPrice() * env.getProperty("config.price.taxes",Double.class);
            // Product newProduct = new Product(p.getName(),p.getId(),precioFinal.longValue());
            // return newProduct;
            p.setPrice(precioFinal.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    @Override
    public Product getProductById(Long id) {
        return repositories.findById(id);
    }
}
