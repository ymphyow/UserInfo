package com.electricsystem.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electricsystem.user.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	List<User> findBySurname(String surname);
	
}



