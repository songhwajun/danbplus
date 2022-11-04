package com.danbplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "com.danbplus")
//@ComponentScan(basePackages = "com.danbplus")
public class DanbplusApplication {
	
	public static void main(String[] args) {
		System.out.println("===========================================");
		System.out.println("[START] Spring");
		System.out.println("===========================================");
		
		SpringApplication.run(DanbplusApplication.class, args);
	}

}
