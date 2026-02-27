package com.capgemini.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.ProjectConfiguration;
import com.capgemini.dto.Employee;

public class Main {

	// single ton--> one object
	public static void main(String[] args) {
		ApplicationContext ioc = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
	     
	
		AnnotationConfigApplicationContext ac = (AnnotationConfigApplicationContext)ioc;
		
		ac.close();
	  
	} 
}
