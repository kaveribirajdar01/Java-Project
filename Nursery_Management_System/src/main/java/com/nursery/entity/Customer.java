package com.nursery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	public int CId;
	public String CName;
		
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int cId, String cName) {
		super();
		CId = cId;
		CName = cName;
	}

	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		CId = cId;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	
	
}
