package com.liu.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.liu.mall")
@MapperScan(basePackages = "com.liu.mall.mapper")
public class LmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(LmallApplication.class, args);
    }

}
