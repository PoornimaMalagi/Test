package com.mav.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = {"com.mav.details.controller"})
public class DetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetailsApplication.class, args);
	}

}
