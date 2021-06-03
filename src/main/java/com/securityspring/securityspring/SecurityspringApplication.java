package com.securityspring.securityspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.securityspring.controller"), @ComponentScan("com.securityspring.config") })
public class SecurityspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityspringApplication.class, args);
	}

}
