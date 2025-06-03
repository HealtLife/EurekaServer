package com.acme.eureka.nutrimove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  // Activa Eureka Server en esta aplicación
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
