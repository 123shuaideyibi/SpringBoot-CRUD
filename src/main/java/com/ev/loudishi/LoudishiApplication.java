package com.ev.loudishi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ev.loudishi.dao")
public class LoudishiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoudishiApplication.class, args);
    }

}
