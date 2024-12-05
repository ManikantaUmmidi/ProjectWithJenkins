package com.example.jenkisfirstproject;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkisfirstprojectApplication {

	static Logger logger = LoggerFactory.getLogger(JenkisfirstprojectApplication.class);

	@PostConstruct
	public void init() {
		logger.info("project started successfully");
	}

	public static void main(String[] args) {

		SpringApplication.run(JenkisfirstprojectApplication.class, args);

		logger.info("Application executed");
	}

}
