package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication  application        = new SpringApplication(DemoApplication.class);
		ApplicationContext applicationContext = application.run(args);

	}

}
