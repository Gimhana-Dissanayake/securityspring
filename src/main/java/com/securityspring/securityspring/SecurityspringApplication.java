package com.securityspring.securityspring;

import java.util.HashSet;
import java.util.Set;

import com.securityspring.domain.Role;
import com.securityspring.domain.User;
import com.securityspring.repository.RoleRepository;
import com.securityspring.repository.UserRepository;
import com.securityspring.service.CustomUserDetailsService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ComponentScan("package com.securityspring.*")
@EnableMongoRepositories("com.securityspring.repository")
public class SecurityspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityspringApplication.class, args);
	}

	@Bean
	CommandLineRunner init(RoleRepository roleRepository, UserRepository userRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {

		return args -> {

			Role adminRole = roleRepository.findByRole("ADMIN");
			if (adminRole == null) {
				Role newAdminRole = new Role();
				newAdminRole.setRole("ADMIN");
				Role ro = roleRepository.save(newAdminRole);
				Set<Role> sR = new HashSet<Role>();
				sR.add(ro);

				User u = new User("saman@gmail.com", "12345", "saman kumara", sR);
				userRepository.save(u);
			}

			Role userRole = roleRepository.findByRole("USER");
			if (userRole == null) {
				Role newUserRole = new Role();
				newUserRole.setRole("USER");
				Role ro = roleRepository.save(newUserRole);

				Set<Role> sR = new HashSet<Role>();
				sR.add(ro);

				User u = new User("kamal@gmail.com", "12345", "Kamal Perera", sR);
				u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
				userRepository.save(u);
			}

		};

	}
}
