package com.colak.springtutorial.controller;

import com.colak.springtutorial.model.Product;
import com.colak.springtutorial.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Mono<Product> createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

}
