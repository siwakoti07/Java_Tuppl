package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer>{
	
	Optional<EmployeeEntity> findByEmailIdAndPassword(String email,String password);

}
