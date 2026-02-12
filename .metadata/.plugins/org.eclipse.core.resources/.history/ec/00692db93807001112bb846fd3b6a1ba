package com.product_hibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.product.Product;
import com.product.ProductDao;
//ctrl+shift+o
public class ProductDaoTest {

	
	//EMF
	//EM
	//ET
	
	static EntityManagerFactory emf;
	
	EntityManager em;
	
	@BeforeAll
	public static void initEmf() {
	 System.out.println("init Emf"); 
	 emf=Persistence.createEntityManagerFactory("postgres");
	}
	
	@BeforeEach
	public void initEm() {
		em=emf.createEntityManager();
	}
	
	@Test
	public void insertProductTest() {
	System.out.println("Product Insert");
		ProductDao dao=new ProductDao();
		Product product =new Product();
		product.setId(2);
		product.setName("Pencil");
		product.setPrice(5);
		String actualRes=dao.insertProduct(product);
		assertEquals("Data inserted",actualRes);
	}
	
	@Test
	public void insertProductTestNull() {
		ProductDao dao=new ProductDao();
		String actualRes=dao.insertProduct(null);
		assertEquals("Illegeal Argument",actualRes);
	}
	
	
	@Test
    public void findByIdTest() {
	System.out.println("Product Find");
	ProductDao dao=new ProductDao();
	Product p=dao.findById(1);
	assertNotNull(p);
	}
	
	@Test
	public void findByIdTestException() {
		ProductDao dao=new ProductDao();
	
		  assertThrows(IllegalArgumentException.class, ()->dao.findById(100));
		
	}
/*	
	@Test
	public void deleteByIdTest() {
		ProductDao dao=new ProductDao();
		String actualRes=dao.deleteById(1);
		assertEquals("Deleted", actualRes);
	}
	@Test
	public void deleteByIdTestNotExist() {
		ProductDao dao=new ProductDao();
		String actualRes=dao.deleteById(100);
		assertEquals("Data Not exist", actualRes);
	}
*/
	@AfterEach
	public void destroyEm() {
		em.close();
	}
	@AfterAll
	public static void destroyEmf() {//close
		emf.close();
	}
	
	
}
