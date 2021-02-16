package com.myMicroService1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    Environment environment;

    public List<ProductEntity> findAll() {
        return productRepo.findAll();
    }

    public ProductEntity findByName(String name) {
        return productRepo.findByName(name);
    }

    public ProductEntity addProduct(Map<String, Object> map) {
        ProductEntity p = new ProductEntity();
        p.setName((String) map.get("name"));
        p.setDescription((String) map.get("description"));
        p.setPrice((Integer) map.get("price"));
        p.setQuantity((Integer) map.get("quantity"));
        p.setPort(Integer.parseInt(environment.getProperty("local.server.port")));

        return productRepo.save(p);
    }
}
