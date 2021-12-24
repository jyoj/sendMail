package com.example.sim.customerSim.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sim.customerSim.entity.SimEntity;
import com.example.sim.customerSim.repository.SimRepo;

import com.example.sim.customerSim.service.SimService;
@Service
public class SimServiceImpl implements SimService{
	@Autowired
	SimRepo simRepo;



	@Override
	public List<SimEntity> getAllSims() {
		List<SimEntity> se = simRepo.findAll();
		
		for (SimEntity sen : se) {
			System.out.println(sen.getId()+"  "+sen.getSim_no());
		}
		return se;
	}

	
	
	
}
