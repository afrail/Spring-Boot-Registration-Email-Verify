package com.example.SpringBootRegistrationEmailVerify.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootRegistrationEmailVerify.Config.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String>{
	
	ConfirmationToken findByConfirmationToken(String confirmationToken);

}
