package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fizzbuzz {
    @GetMapping("/fizzbuzz/")
    public StringBuilder fizzBuzz(){
        StringBuilder output = new StringBuilder();
        int[] fizzbuzz = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i : fizzbuzz) {
            if (i%15 == 0) {
                output.append("FizzBuzz ");
            } else if (i%5 == 0) {
                output.append("Fizz ");
            } else if (i%3 == 0) output.append("Buzz ");
            else {
                output.append(i).append(" ");
            }
        }
        return output;
    }
}
