package com.flylater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : Flylater
 * @version : 1.0
 * @create : 2020/4/18 12:06
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        // 启动Spring应用
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
