package com.example.jenkinspipelinedemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinspipelinedemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testSuma() {
		assertEquals(5, JenkinspipelinedemoApplication.sumar(2, 3));
	}

}
