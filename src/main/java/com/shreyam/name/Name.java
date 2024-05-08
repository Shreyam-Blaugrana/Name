package com.shreyam.name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Name {

    public static void main(String[] args) {
        SpringApplication.run(Name.class, args);
        printName("Your Name");
    }

    private static void printName(String name) {
        System.out.println("Hello, " + name + "sahu");
    }
}

