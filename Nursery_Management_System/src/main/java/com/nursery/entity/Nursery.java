package com.nursery.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Nursery {

	@Id
	public int PId;
	public String PName;
	public int Price;
	
	
	public Nursery() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Nursery(int pId, String pName, int price) {
		super();
		PId = pId;
		PName = pName;
		Price = price;
	}



	public int getPId() {
		return PId;
	}


	public void setPId(int pId) {
		PId = pId;
	}


	public String getPName() {
		return PName;
	}


	public void setPName(String pName) {
		PName = pName;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}
	
	
	
	
	
}
