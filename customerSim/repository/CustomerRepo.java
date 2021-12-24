package com.example.sim.customerSim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sim.customerSim.entity.CustomerEntity;


public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer>{
	@Query(
			  value = "SELECT * FROM customer c WHERE c.dob = ?1", 
			  nativeQuery = true)
	CustomerEntity getCustomerById(int customer_Id);

	

}
