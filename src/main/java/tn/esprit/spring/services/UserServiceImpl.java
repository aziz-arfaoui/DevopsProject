package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepository;

	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);
	
	@Override
	public List<User> retrieveAllUsers() { 
		List<User> users = null; 
		try {
	
			l.info("In getAllUsers() : ");
			
			users = (List<User>) userRepository.findAll();  
			for (User user : users) {
				l.info(user.getId());
			} 
			
			l.info("End of retrieve all users");
			
		}catch (Exception e) {
			l.error("Error in retrieve all users", e);
		}

		return users;
	}


	@Override
	public User addUser(User u) {
		l.info("In method addContrat");
		User u_saved = userRepository.save(u); 
		l.info("out of method addContrat");
		return u_saved; 
	}

	@Override 
	public User updateUser(User u) { 
		l.info("In method updateContrat");
		User u_saved = userRepository.save(u); 
		l.info("out of method updateContrat");
		return u_saved;
	}

	@Override
	public void deleteUser(String id) {
		l.info("In method deleteContrat");
		userRepository.deleteById(Long.parseLong(id)); 
		l.info("out of  method deleteContrat");
	}

	@Override
	public User retrieveUser(String id) {
		User us = null ;
		try{
			l.info("in  method retrieveContrat");
			User u =  userRepository.findById(Long.parseLong(id)).get(); 
			l.info("out of  method retrieveContrat");
		}
		catch(Exception e){
			l.error("error in retrieveContrat"+ e);
		}
		return us; 
	}

}