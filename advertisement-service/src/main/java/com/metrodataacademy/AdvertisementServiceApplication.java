package com.metrodataacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvertisementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvertisementServiceApplication.class, args);
		System.out.println("================================");
		System.out.println("ADVERTISEMENT SERVICE IS RUNNING");
		System.out.println("================================");
	}

}
