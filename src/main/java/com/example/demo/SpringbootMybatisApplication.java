package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.service","com.example.demo.dao","com.example.demo.service.imple","com.example.demo.entity"} )
public class SpringbootMybatisApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootMybatisApplication.class, args);
		
		
	}

}
