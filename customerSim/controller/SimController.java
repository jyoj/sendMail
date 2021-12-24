package com.example.sim.customerSim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sim.customerSim.entity.SimEntity;
import com.example.sim.customerSim.service.SimService;

@RestController
public class SimController {
	@Autowired
	private SimService simService;
	
		

	@GetMapping("/sim")
	public @ResponseBody List<SimEntity> getAllSims() {
		return simService.getAllSims();
	}
	}
