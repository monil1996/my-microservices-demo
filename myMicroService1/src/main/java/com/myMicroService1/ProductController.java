package com.myMicroService1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/all")
    public List<ProductEntity> getAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/product/{name}")
    public ProductEntity getProductByName(@PathVariable String name){
        return productService.findByName(name);
    }

    @PostMapping("/add")
    public ResponseEntity addProduct(@RequestBody Map<String,Object> map){
        ProductEntity res = productService.addProduct(map);
        return new ResponseEntity(res, HttpStatus.CREATED);
    }

}
