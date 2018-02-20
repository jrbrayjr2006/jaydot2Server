package com.jaydot2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Jaydot2Application {

    public static void main(String[] args) {
        SpringApplication.run(Jaydot2Application.class, args);
    }
}
