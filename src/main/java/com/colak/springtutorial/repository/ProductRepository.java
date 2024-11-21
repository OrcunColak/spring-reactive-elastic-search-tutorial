package com.colak.springtutorial.repository;

import com.colak.springtutorial.model.Product;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;

public interface ProductRepository extends ReactiveElasticsearchRepository<Product, String> {
}
