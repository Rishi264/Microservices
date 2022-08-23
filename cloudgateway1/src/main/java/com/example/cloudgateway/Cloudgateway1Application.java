package com.example.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Cloudgateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cloudgateway1Application.class, args);
	}

}
