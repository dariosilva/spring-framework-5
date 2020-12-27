package com.dams.sec4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml") // USED TO IMPORT XML CONFIGURATION
public class Sec4Application {

	public static void main(String[] args) {
		SpringApplication.run(Sec4Application.class, args);
	}

}
