package com.myMicroService1;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Product")
public class ProductEntity {

    private String id;
    private String name;
    private String description;
    private int price;
    private int quantity;
    private int port;

}
