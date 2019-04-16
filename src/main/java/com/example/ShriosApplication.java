package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.mapper")//配置mybatis包扫描
public class ShriosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShriosApplication.class, args);
    }

}
