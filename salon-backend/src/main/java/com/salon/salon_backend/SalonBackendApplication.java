package com.salon.salon_backend;  // ✅ Ensure this matches your package name

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.salon")  // ✅ Ensures scanning of controllers
public class SalonBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(SalonBackendApplication.class, args);
    }
}
