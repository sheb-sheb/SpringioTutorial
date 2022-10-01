package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //ready for use by Spring MVC to handle web requests //combines @Controller & @ResponseBody to give raw data rather than view
public class HelloController {
    @GetMapping("/") //maps "localhost:8080/" to this method
    public String index() {
        return "asdlknjhv";
    }
}
