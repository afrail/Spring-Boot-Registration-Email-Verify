package com.example.SpringBootRegistrationEmailVerify.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootRegistrationEmailVerify.Entity.User;


@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String>{
	
	User findByEmailIdIgnoreCase(String emailId);

}
