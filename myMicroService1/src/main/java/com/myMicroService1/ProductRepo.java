package com.myMicroService1;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends MongoRepository<ProductEntity,String> {
    ProductEntity findByName(String name);
}
