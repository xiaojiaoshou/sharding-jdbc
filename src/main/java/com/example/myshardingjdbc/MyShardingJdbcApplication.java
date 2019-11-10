package com.example.myshardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@MapperScan("com.example.myshardingjdbc.mapper")
@SpringBootApplication
public class MyShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShardingJdbcApplication.class, args);
    }

}
