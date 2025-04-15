package com.example.jenkinspipelinedemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinspipelinedemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JenkinspipelinedemoApplication.class, args);
		System.out.println("Hola desde Jenkins CI Pipeline!");
	}

	public static int sumar(int a, int b) {
		return a + b;
	}

}
