package com.manytooneprac;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	     
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Department dept =new Department();
		
		dept.setManagerName("Allen");
		dept.setName("HR");
		dept.setNo_of_employee(5);
		
//		Employee e1=new Employee();
//		
//		e1.setName("Miller");
//		e1.setSalary(2000);
//		e1.setDesgnation("ASE");
//		e1.setDept(dept);
//		
//		Employee e2=new Employee();
//		
//		e2.setName("Virat");
//		e2.setDesgnation("Analyst");
//		e2.setSalary(3000);
//		e2.setDept(dept);
		
		et.begin();
		
		em.persist(dept);
		
		et.commit();
		
	}
}
