package com.prac;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main2 {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
	     EntityManager em = emf.createEntityManager();
	     EntityTransaction et = em.getTransaction();
	     String sqlDeleteCS="delete from college_student where student_s_id=?1";
	     String sql1="Delete from student where s_id=?1";
	    Query delete_college_student=em.createNativeQuery(sqlDeleteCS);
	    
	    Query delete_student=em.createNativeQuery(sql1);
	    
	    delete_college_student.setParameter(1,101);
	    
	    delete_student.setParameter(1,101);
	    
	    et.begin();
	    delete_college_student.executeUpdate();
	    
	    delete_student.executeUpdate();
	    et.commit();
	}
}
