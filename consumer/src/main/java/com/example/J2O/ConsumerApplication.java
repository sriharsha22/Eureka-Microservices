package com.example.J2O;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import Controller.ConsumerController;



@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ConsumerApplication.class, args);
		
		ConsumerController consumerController=ctx.getBean(ConsumerController.class);
		
		System.out.println(consumerController);
		try {
			consumerController.getInfo();
		} catch (RestClientException | IOException e) {
			
			e.printStackTrace();
		}

	}
	
	@Bean
	public  ConsumerController  consumerControllerClient()
	{
		return  new ConsumerController();
	}
		
}
