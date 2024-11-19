package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.service.ProductServiceClient;

import reactor.core.publisher.Mono;

@RestController
public class ProductController {

    private final ProductServiceClient productServiceClient;

    public ProductController(ProductServiceClient productServiceClient) {
        this.productServiceClient = productServiceClient;
    }

    @GetMapping("/product")
    public Mono<String> getObject() {
        return productServiceClient.fetchObject();
    }

    @GetMapping("/product/id/{id}")
    public Mono<String> getObjectById(@PathVariable int id) {
        return productServiceClient.fetchObjectById(id);
    }
}
