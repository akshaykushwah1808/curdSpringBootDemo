package com.strikes.crudSpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class CrudSpringBootDemoApplication {

	public static void main(String[] args) {
        SpringApplication.run(CrudSpringBootDemoApplication.class, args);
        System.out.println("Hello");
	}
}




// exclude = {DataSourceAutoConfiguration.class} -----> for Deta source ka Object IOC auto configure na kare
