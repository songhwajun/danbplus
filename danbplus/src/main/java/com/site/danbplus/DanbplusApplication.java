package com.site.danbplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.site")
public class DanbplusApplication {

	public static void main(String[] args) {
		System.out.println("===========================================");
		System.out.println("[START] Spring");
		System.out.println("===========================================");
		
		SpringApplication.run(DanbplusApplication.class, args);
	}

}
