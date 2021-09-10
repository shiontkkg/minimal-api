package com.restartmylife35.minimal_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.restartmylife35.minimal_api"})
//@EnableAutoConfiguration(exclude = {ContextInstanceDataAutoConfiguration.class})
public class MinimalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinimalApiApplication.class, args);
	}

}
