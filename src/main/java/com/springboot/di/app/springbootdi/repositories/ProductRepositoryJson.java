package com.springboot.di.app.springbootdi.repositories;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.di.app.springbootdi.model.Product;

public class ProductRepositoryJson implements ProductRepository{


    List<Product> products;
    

    public ProductRepositoryJson(Resource resource) {
        //Resource resource = new ClassPathResource("product.json");//Obtenermos el archivo de products.json
        ObjectMapper objectMapper = new ObjectMapper();//Con el mapper podemos transformar el fichero en un objeto que puede leer Java
        try {
            products = Arrays.asList(objectMapper.readValue(resource.getFile(), Product[].class));//Con el mapper leermos el archivo y lo transformamos en una Lista de Product
            //en readValue se necesita 2 parametros, el File y la clase a la que quieres transformar
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Long id) {
        return products.stream().filter(p->{return p.getId().equals(id);}).findFirst().orElseThrow();
    }

}
