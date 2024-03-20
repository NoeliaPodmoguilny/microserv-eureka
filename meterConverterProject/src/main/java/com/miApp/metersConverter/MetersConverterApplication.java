package com.miApp.metersConverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MetersConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetersConverterApplication.class, args);
	}

}
