package com.example.jenkisfirstproject;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JenkisfirstprojectApplicationTests {

	static Logger logger = LoggerFactory.getLogger(JenkisfirstprojectApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing");
		assertEquals("Mani", "Mani");
	}

}
