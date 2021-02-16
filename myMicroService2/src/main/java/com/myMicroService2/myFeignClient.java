package com.myMicroService2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(name = "myMicroservice1", url = "localhost:8100")
@FeignClient(name = "myMicroservice1")
public interface myFeignClient {

    @GetMapping("/product/all")
    public List<Object> getAllProducts();

    @GetMapping("/product/{name}")
    public Object getProductByName(@PathVariable String name);
}
