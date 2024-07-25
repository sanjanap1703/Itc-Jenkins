package com.itc.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
@SpringBootApplication
public class JenkinsApplication {
	public static Logger Logger=LoggerFactory.getLogger(JenkinsApplication.class);
	@PostConstruct
	public void myMethod() {
		Logger.info("Application started");
		
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
