package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class penis {
    @GetMapping("/penis/")
    public String penisPage() {
        final String output = "penis page";
        return output;

    }
}
