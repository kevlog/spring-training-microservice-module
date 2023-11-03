package com.metrodataacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebForumApplication.class, args);

		System.out.println("============================");
		System.out.println("WEB FORUM SERVICE IS RUNNING");
		System.out.println("============================");
	}
}
