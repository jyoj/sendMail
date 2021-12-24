package com.example.sim.customerSim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sim.customerSim.entity.CustomerEntity;
import com.example.sim.customerSim.service.serviceimpl.CustomerServiceImpl;


@RestController
public class CustomerController {
	@Autowired
	CustomerServiceImpl customerServiceInf;
	
	
	
		
	@GetMapping("/customers")
	public @ResponseBody List<CustomerEntity> getAllCustomers() {
		return customerServiceInf.getAllCustomers();
	}
	@GetMapping("/findBirthdayCustomers")
	public String findCustomers() {

		// customerServiceInf.findBirthdayCustomer(ce);
		 return "findBirthdayCustomer";
	}
	
	@GetMapping("/sendBirthdayMail")
	public @ResponseBody String sendBirthdayMail() {
		customerServiceInf.sendMail();
		return "success";
	}
	
	
	
}
