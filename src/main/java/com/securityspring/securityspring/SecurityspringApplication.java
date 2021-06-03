package com.securityspring.securityspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("package com.securityspring.*")
@EnableMongoRepositories("com.securityspring.repository")
public class SecurityspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityspringApplication.class, args);
	}

}
