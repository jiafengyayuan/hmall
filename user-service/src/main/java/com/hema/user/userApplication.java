package com.hema.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.hema.api.client")
@MapperScan("com.hema.user.mapper")
@SpringBootApplication
public class userApplication {
    public static void main(String[] args) {
        SpringApplication.run(userApplication.class, args);
    }
}