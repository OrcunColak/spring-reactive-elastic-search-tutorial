package com.colak.springtutorial.service;

import com.colak.springtutorial.model.Product;
import com.colak.springtutorial.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Mono<Product> saveProduct(Product product) {
        return productRepository.save(product);
    }

}
