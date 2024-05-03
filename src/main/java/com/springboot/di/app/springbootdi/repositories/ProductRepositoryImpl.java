package com.springboot.di.app.springbootdi.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import com.springboot.di.app.springbootdi.model.Product;

@Repository("productList")
@Primary
//@SessionScope//El contexto dura mientras dura la sesion del cliente
@RequestScope//El contexto se mantiene solo durante este request
public class ProductRepositoryImpl implements ProductRepository {

    List<Product> products = new ArrayList<>();

    public ProductRepositoryImpl() {
        this.products = Arrays.asList(new Product("Patatas",1l,100l),
        new Product("Arroz",2l,2l),
        new Product("Leche",3l,3l),
        new Product("Carne",4l,4l),
        new Product("Cereal",5l,5l),
        new Product("Sal",6l,6l));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
    
    @Override
    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
    

}
