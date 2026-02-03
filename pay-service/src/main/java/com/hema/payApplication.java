package com.hema;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.hema.api.client")
@MapperScan("com.hema.pay.mapper")
@SpringBootApplication
public class payApplication {
    public static void main(String[] args) {
        SpringApplication.run(payApplication.class, args);
    }
}