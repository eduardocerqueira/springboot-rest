package com.example.rest.service;

import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ProductServiceClient {
    private final String apiUrl = "https://api.restful-api.dev";
    private final WebClient webClient;

    public ProductServiceClient() {
        this.webClient = WebClient.builder().baseUrl(apiUrl).build();
    }

    public Mono<String> fetchObject() {
        return webClient.get()
                .uri("/objects/7")
                .retrieve()
                .bodyToMono(String.class);
    }

    public Mono<String> fetchObjectById(int id) {
        return webClient.get()
                .uri("/objects/{id}", id)
                .retrieve()
                .bodyToMono(String.class);
    }
}
