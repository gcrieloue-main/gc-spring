package com.crieloue.gcsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// no need to enable resource server on Spring Boot 2.x
// @EnebleResourceServer
public class GcSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcSecurityApplication.class, args);
	}

}
