package com.zzz.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangjiadong
 * @date 2020/8/20
 */
@SpringBootApplication
public class Payment8001Main {

    public static void main(String[] args) {
        SpringApplication.run(Payment8001Main.class, args);
        System.out.println("\u001b[38;5;11mswagger地址："+"http://localhost:8001/swagger-ui.html");
    }
}
