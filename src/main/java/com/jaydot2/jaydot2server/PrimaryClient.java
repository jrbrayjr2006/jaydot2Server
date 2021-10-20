package com.jaydot2.jaydot2server;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PrimaryClient {

    private final WebClient webClient;

    public PrimaryClient(WebClient.Builder webClientBuilder) {
        webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
    }
}
