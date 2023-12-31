package com.metrodataacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
		System.out.println("==============================");
		System.out.println("API GATEWAY SERVICE IS RUNNING");
		System.out.println("==============================");
	}

}
