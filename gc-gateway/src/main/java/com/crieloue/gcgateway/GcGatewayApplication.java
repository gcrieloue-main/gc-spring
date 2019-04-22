package com.crieloue.gcgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GcGatewayApplication {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("notes", r -> r
                        .path("/notes")
                        .uri("http://localhost:8081"))
                .route("notes2", r -> r
                        .path("/notesService")
                        // if no rewrite path
                        // it would call http://localhost:8081/noteService
                        .filters(f -> f.rewritePath("/notesService", "/notes"))
                        .uri("http://localhost:8081"))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(GcGatewayApplication.class, args);
    }

}
