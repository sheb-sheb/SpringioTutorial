package com.example.springboot;

import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class ReverseString {
    @GetMapping("/reverse-string/")
    public StringBuilder stringReversal() {
        String string = "coding exercise";
        boolean makeCapitol = true;
        StringBuilder output = new StringBuilder();
        for (int i = string.length() - 1; 0 <= i; i--) {
            if (makeCapitol) {
                output.append(Character.toString(string.charAt(i)).toUpperCase(Locale.ROOT));
                makeCapitol = false;
            } else {
                output.append(string.charAt(i));
                if (string.charAt(i) == ' ') makeCapitol = true;
            }
        }
        return output;
    }
}
