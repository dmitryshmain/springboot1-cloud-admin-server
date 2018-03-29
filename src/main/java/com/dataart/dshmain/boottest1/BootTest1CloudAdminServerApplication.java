package com.dataart.dshmain.boottest1;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class BootTest1CloudAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootTest1CloudAdminServerApplication.class, args);
	}
}
