package com.salon.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SalonController {

    @GetMapping("/services")
    public List<String> getServices() {
        return Arrays.asList("Haircut", "Bridal Makeup", "Facial", "Manicure", "Pedicure");
    }
}
