package com.example.commentService.fisCommentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FisCommentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisCommentServiceApplication.class, args);
	}

}
