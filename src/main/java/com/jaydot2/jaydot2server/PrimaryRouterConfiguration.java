package com.jaydot2.jaydot2server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class PrimaryRouterConfiguration {

    @Bean
    public RouterFunction<ServerResponse> primaryRoute(PrimaryHandler handler) {
        return route(GET("/heartbeat").and(accept(MediaType.APPLICATION_JSON)), handler::heartbeat);
    }
}
