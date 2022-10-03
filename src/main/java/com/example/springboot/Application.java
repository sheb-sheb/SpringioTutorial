package com.example.springboot;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
/*
@SpringBootApplication adds all of following
- Configuration - makes class source of bean definitions
- @EnableAutoConfiguration - adds beans based on classpath, settings, beans and property settings
- @ComponentScan - look for components, configs, and services, letting it find controllers
 */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);//launches application without xml
    }
    //bean is an object
    @Bean //tells spring boot that method returns a bean that it needs to handle
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}