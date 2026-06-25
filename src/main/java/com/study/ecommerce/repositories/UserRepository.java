package com.study.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, String> {
	
//	custom query Method     existsByFieldName    findByFieldName
   boolean	existsByEmail(String email);

}
