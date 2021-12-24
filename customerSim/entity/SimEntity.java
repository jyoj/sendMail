package com.example.sim.customerSim.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sim")
public class SimEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO )
	private int id;
	private int sim_no;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSim_no() {
		return sim_no;
	}
	public void setSim_no(int sim_no) {
		this.sim_no = sim_no;
	}
	



}
