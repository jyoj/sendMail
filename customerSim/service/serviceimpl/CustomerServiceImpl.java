package com.example.sim.customerSim.service.serviceimpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sim.customerSim.controller.SendMail;
import com.example.sim.customerSim.entity.CustomerEntity;
import com.example.sim.customerSim.repository.CustomerRepo;
import com.example.sim.customerSim.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepo customerRepo;
	

	@Override
	public List<CustomerEntity> getAllCustomers() {
		return customerRepo.findAll();
		}


	public void sendMail() {
		
		List<CustomerEntity> cus=customerRepo.findAll();
		for (CustomerEntity ce : cus) {
			if(cheackBirthDay(ce.getDob())){
				System.out.println("send mail");
				SendMail.myMail(ce.getEmail());
				
			}
		}
		
	}

	public boolean cheackBirthDay(String dob) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");

		LocalDate localDate = LocalDate.parse(dob, formatter);

		LocalDate curretDate = LocalDate.now();
		System.out.println("7days before date" + localDate.plusDays(-7));

		int day = localDate.plusDays(-7).getDayOfMonth();
		int month = localDate.plusDays(-7).getMonthValue();

		int cd = curretDate.getDayOfMonth();
		int cm = curretDate.getMonthValue();

		String birthDate = String.valueOf(day + "" + month);
		String todayDate = String.valueOf(cd + "" + cm);

		if (birthDate.equals(todayDate)) {
			return true;
		}
		return false;

	}
		
	
	


}
