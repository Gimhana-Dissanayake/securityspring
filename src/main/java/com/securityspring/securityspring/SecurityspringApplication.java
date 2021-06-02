package com.securityspring.securityspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.securityspring.controller")
public class SecurityspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityspringApplication.class, args);
	}

}
