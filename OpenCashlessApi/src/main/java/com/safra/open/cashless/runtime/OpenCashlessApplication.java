package com.safra.open.cashless.runtime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@ComponentScan({ "com.safra.open.cashless" })
@EntityScan(basePackages = { "com.safra.open.cashless" })
@EnableJpaRepositories(basePackages = { "com.safra.open.cashless" })
@SpringBootApplication
public class OpenCashlessApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenCashlessApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
