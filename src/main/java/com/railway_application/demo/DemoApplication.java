package com.railway_application.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping(path = "/get_user")
    public String getUser(){
        return "Hello Shaik Welcome To Spring Boot Application";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
