package com.example.confidserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfidserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfidserverApplication.class, args);
	}

}
