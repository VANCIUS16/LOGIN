package com.example.demo.interfaceService;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.modelo.User;

public interface UserRepository extends CrudRepository<User, Long>{
	@Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUserName(@Param("username") String username);
	
}
