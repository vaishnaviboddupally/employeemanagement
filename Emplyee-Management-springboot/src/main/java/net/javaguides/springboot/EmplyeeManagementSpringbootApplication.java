package net.javaguides.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.javaguides.springboot.service.EmployeeService;
import net.javaguides.springboot.service.EmployeeServiceImpl;

@SpringBootApplication
public class EmplyeeManagementSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmplyeeManagementSpringbootApplication.class, args);
	}
	
	

}
