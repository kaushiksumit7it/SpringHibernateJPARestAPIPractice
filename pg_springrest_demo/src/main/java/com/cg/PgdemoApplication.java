package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PgdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgdemoApplication.class, args);
	}

}
