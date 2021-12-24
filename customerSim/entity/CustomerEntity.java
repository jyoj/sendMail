package com.example.sim.customerSim.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )	
	private int  customer_id;
	private String name;
	private String email;
	private String dob;
	public int getId() {
		return customer_id;
	}
	public void setId(int id) {
		this.customer_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	


}
