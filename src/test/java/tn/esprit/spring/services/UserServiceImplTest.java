package tn.esprit.spring.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import tn.esprit.spring.entities.User;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@WebAppConfiguration
public class UserServiceImplTest {
	
	@Autowired
	IUserService us;
	
	@Test
	public void TestRetrieveAllUsers() {
		List<User> listUsers = us.retrieveAllUsers();
		//Assertions.assertEquals(2, listUsers.size());
	}
	

}
