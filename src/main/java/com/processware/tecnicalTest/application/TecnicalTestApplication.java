package com.processware.tecnicalTest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.processware.tecnicalTest.controller.OrderController;

@SpringBootApplication
@ComponentScan(basePackageClasses = OrderController.class)
public class TecnicalTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TecnicalTestApplication.class, args);
	}

}
