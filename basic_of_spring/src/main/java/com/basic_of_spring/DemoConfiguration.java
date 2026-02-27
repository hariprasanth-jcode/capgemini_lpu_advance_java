package com.basic_of_spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com")
public class DemoConfiguration {

	@Bean
	public Scanner getScanner() {
		
		return new Scanner(System.in);
	}
	
	
	@Bean
	public List<String> getabc(){
		return List.of("Miller","Brevas","Holder");
	}
}
