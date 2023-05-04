package com.sl17.springboot312.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages="com.sl17.springboot312.model")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
