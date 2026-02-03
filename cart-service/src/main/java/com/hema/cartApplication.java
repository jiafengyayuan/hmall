package com.hema;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.hema.api.client")
@MapperScan("com.hema.cart.mapper")
@SpringBootApplication
public class cartApplication {
    public static void main(String[] args) {
        SpringApplication.run(cartApplication.class, args);
    }
}