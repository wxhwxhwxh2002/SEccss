package com.se.seccss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@ComponentScan(basePackages = {"com.se.ccss.controller"})
public class SEccssApplication {

    public static void main(String[] args) {
        SpringApplication.run(SEccssApplication.class, args);
    }
    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
}
