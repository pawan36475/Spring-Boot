package com.jpa.test.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

import java.util.*;

public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByName(String name);

	public List<User> findByNameAndCity(String name, String City);

	@Query("select u FROM User u") //JPQL
	public List<User> getAllUser();
	
	@Query("select u FROM User u where u.name =:n") //JPQL	
	public List<User> getUserByName(@Param("n")String name);
	
	@Query(value="select * from user",nativeQuery=true)//SQL Query
    public List<User> getUsers();

}

	