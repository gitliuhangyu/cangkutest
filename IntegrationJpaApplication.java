package com.epipe.integration_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class IntegrationJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationJpaApplication.class, args);
    }

}

