package com.hema.trade;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.hema.api.client")
@MapperScan("com.hema.trade.mapper")
@SpringBootApplication
public class tradeApplication {
    public static void main(String[] args) {
        SpringApplication.run(tradeApplication.class, args);
    }
}