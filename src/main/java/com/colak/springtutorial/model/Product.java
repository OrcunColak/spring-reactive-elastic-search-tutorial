package com.colak.springtutorial.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "products")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
}
