package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@WebAppConfiguration
public class UserServiceImplTest {
	
	@Autowired
	IUserService us;
	Date firstDate = new Date();
	User u = new User ("karim","wesleti", firstDate ,Role.ADMINISTRATEUR);
	
	@Test
	public void TestRetrieveAllUsers() {
		List<User> listUsers = us.retrieveAllUsers();
	}
	@Test
	public void TestAddUser() {
		User u = new User ("karim","wesleti", firstDate ,Role.ADMINISTRATEUR);
		us.addUser(u);
		System.out.println(u);
	}
	@Test
	public void TestDeleteUser() {
		us.deleteUser(u.getId().toString());
		System.out.println("Done Deleting");

	}
	@Test
	public void TestUpdateUser() {
		u.setLastName("Arfaoui");
		us.updateUser(u);
		System.out.println(u);
	}
	@Test
	public void TestRetrieveUser() {
		us.retrieveUser(u.getId().toString());
		System.out.println(u);
	}
	

}
