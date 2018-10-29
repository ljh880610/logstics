package com.logistics.logistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LogisticsApplication {

    @RequestMapping(value="test")
    String index() {
        return "Hello Spring Boot 1122";
    }

    public static void main(String[] args) {
        SpringApplication.run(LogisticsApplication.class, args);
    }
}
