package com.example.gateway.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try{
			SpringApplication.run(Application.class, args);
			System.out.println("----------success------------");
		}catch (Throwable t){
			t.printStackTrace();
		}
	}

}
