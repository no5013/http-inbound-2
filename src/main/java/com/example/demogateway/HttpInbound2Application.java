package com.example.demogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:integration.xml")
public class HttpInbound2Application {

	public static void main(String[] args) {
		SpringApplication.run(HttpInbound2Application.class, args);
	}
}
