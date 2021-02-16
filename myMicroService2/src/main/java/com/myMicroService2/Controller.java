package com.myMicroService2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    myFeignClient myFeignClient;

    @GetMapping("/all")
    public List<Object>  getAllProducts(){
        return myFeignClient.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Object getProductByName(@PathVariable String name){
        return myFeignClient.getProductByName(name);
    }
}
