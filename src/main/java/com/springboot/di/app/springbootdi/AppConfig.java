package com.springboot.di.app.springbootdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springboot.di.app.springbootdi.repositories.ProductRepository;
import com.springboot.di.app.springbootdi.repositories.ProductRepositoryJson;

@Configuration
@PropertySource("classpath:configuration.properties")
public class AppConfig {

    //Este es otro metodo de crear un componente para que lo gestione el contenedor de spring
    @Bean
    public ProductRepository productRepositoryJson(){
        return new ProductRepositoryJson();
    }
}
