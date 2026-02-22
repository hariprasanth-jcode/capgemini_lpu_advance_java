package com.manytooneprac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "number_sequence")
	@SequenceGenerator(name="number_sequence",sequenceName ="number_sequence",allocationSize = 1)
	private int id;
	private String name;
	private String managerName;
	private int no_of_employee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getNo_of_employee() {
		return no_of_employee;
	}
	public void setNo_of_employee(int no_of_employee) {
		this.no_of_employee = no_of_employee;
	}
	
	
	
	
}
