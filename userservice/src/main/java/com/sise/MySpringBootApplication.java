package com.sise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.sise.mapper")
public class MySpringBootApplication {
public static void main(String[] args) {
    SpringApplication.run(MySpringBootApplication.class);
}
}