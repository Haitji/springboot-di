package com.springboot.di.app.springbootdi.model;

public class Product {
    private String name;
    private Long id;
    private Long price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Product(String name, Long id, Long price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    public Product() {
    }

    

}
