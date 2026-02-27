package com.basic_of_spring;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//	ApplicationContext	ioc=new ClassPathXmlApplicationContext("config.xml");
	
		ApplicationContext ioc = new AnnotationConfigApplicationContext(DemoConfiguration.class);
	
	   
	    
	    Person person = ioc.getBean(Person.class);
	    System.out.println(person);
	    System.out.println(person.getMobile());
	    
	    ioc.getBean(Mobile.class);
//	    
//	    List<String> list = ioc.getBean(List.class);	    
//	    System.out.println(list);
	    
	    
	   
	}
}
