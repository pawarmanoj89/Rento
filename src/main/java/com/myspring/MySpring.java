package com.myspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpring {
    public static void main(String[] args) {
        System.out.println("Staring Server");
        SpringApplication.run(MySpring.class, args);
    }
}

