package com.basic_of_spring;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	//Dependency Injection
	@Autowired
	private static Mobile mobile;//null , ref null
	
	@Autowired
	private Scanner scan;//null 
	
	
	
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}
	public void message() {
		System.out.println("Hi");
	}
	public Mobile getMobile() {
		return mobile;
	}
	
	//@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	
	public Person(Mobile mobile) {
		
		this.mobile = mobile;
		
	}
	
	
}
