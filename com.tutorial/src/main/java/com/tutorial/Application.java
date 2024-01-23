package com.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
//
//@Configuration: Indicates that the class declares one or more @Bean methods and may be 
//processed by the Spring container to generate bean definitions and service requests.
//
//@EnableAutoConfiguration: Automatically configures the Spring application based on the 
//project's dependencies. It attempts to guess and configure beans that you are likely to need 
//based on classpath settings, other beans, and various property settings.
//
//@ComponentScan: Tells Spring to scan and discover other components (such as controllers, 
//services, and repositories) in the package where the main class is located and its sub-packages.
