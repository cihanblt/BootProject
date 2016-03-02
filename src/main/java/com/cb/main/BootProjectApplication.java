package com.cb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cb.*")
@ComponentScan("com.cb.*")
@EntityScan("com.cb.*")
public class BootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProjectApplication.class, args);
	}
}
