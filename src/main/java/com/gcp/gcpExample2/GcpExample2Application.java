package com.gcp.gcpExample2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GcpExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(GcpExample2Application.class, args);
	}

}
