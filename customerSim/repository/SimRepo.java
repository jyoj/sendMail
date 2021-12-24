package com.example.sim.customerSim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sim.customerSim.entity.SimEntity;



public interface SimRepo extends JpaRepository<SimEntity, Integer>{

	//List<SimEntity> findByCustomerId(int customerId);

}
