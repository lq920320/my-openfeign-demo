package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuqian
 * @date 2019/10/14 10:23.
 */
@SpringBootApplication
@EnableFeignClients
public class MyOpenFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyOpenFeignApplication.class, args);
    }
}
