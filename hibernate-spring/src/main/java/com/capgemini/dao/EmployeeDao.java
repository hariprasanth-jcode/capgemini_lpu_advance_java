package com.capgemini.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capgemini.dto.Employee;
import com.capgemini.main.JpaUtil;

@Repository
public class EmployeeDao {
	
	@Autowired
	JpaUtil jpa;
	
	EntityManager em;
	
	@PostConstruct
	public void getEm() {
	em=jpa.getEntityManager();
	}
	
	public void insert(Employee e) {
		
		em.getTransaction().begin();
		Employee employee=findById(e.getId());
		em.getTransaction().commit();
		
	}
	
	public Employee findById(int id) {
		return em.find(Employee.class, id);
	}

}
