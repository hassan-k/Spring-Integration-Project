package com.spring.intg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
@ImportResource("spring-integration-context.xml")
public class MainApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);		
	}
	
}