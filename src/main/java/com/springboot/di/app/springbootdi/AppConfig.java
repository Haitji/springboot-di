package com.springboot.di.app.springbootdi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.web.context.annotation.RequestScope;

import com.springboot.di.app.springbootdi.repositories.ProductRepository;
import com.springboot.di.app.springbootdi.repositories.ProductRepositoryJson;

@Configuration
@PropertySource("classpath:configuration.properties")
public class AppConfig {

    @Value("classpath:product.json")
    Resource resource;
    //Este es otro metodo de crear un componente para que lo gestione el contenedor de spring
    @Bean
    @RequestScope
    public ProductRepository productRepositoryJson(){
        return new ProductRepositoryJson(resource);
    }
}
