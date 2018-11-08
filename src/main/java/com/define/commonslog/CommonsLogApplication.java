package com.define.commonslog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.log.*.dao"})
@SpringBootApplication
public class CommonsLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonsLogApplication.class, args);
    }
}
