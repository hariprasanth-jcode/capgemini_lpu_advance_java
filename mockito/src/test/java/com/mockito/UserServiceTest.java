package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.User;
import mockito.UserDao;
import mockito.UserService;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
	
	@Mock
	UserDao daomock;
	
	
	@InjectMocks
	UserService service;
	
	
	@Test
	public void typeOfUser() {
		//create mock object  
		//UserDao daomock=mock(UserDao.class);
		
		//create fake object
		User user1=new User();
		user1.setId(2);
		user1.setBalance(1000);
		user1.setName("Miller");
		
		// mention what object should return
		when(daomock.findById(2)).thenReturn(user1);
		
		//Injecting mock object
		//UserService service =new UserService(daomock);
		
		String res=service.typeOfUser(2);
		
		assertEquals("new user", res);
		
	}

}
