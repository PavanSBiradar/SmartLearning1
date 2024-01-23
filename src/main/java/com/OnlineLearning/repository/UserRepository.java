package com.OnlineLearning.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.OnlineLearning.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	

	
	
		boolean existsByEmail(String email);
		
		Users getByEmail(String email);
	

}
