package com.zzz.order80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Order80Application {

    public static void main(String[] args) {
        SpringApplication.run(Order80Application.class, args);
        System.out.println("\u001b[38;5;11mswagger地址："+"http://localhost:8002");
    }

}
