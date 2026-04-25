package com.salon.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Enable CORS for frontend requests
public class ContactController {

    @PostMapping("/contact")
    public ResponseEntity<String> submitContactForm(@RequestBody ContactForm contactForm) {
        System.out.println("Received Contact Form:");
        System.out.println("Name: " + contactForm.getName());
        System.out.println("Phone: " + contactForm.getPhone());
        System.out.println("Email: " + contactForm.getEmail());
        System.out.println("Service: " + contactForm.getService());
        System.out.println("Message: " + contactForm.getMessage());

        return ResponseEntity.ok("Form submitted successfully!");
    }
}
