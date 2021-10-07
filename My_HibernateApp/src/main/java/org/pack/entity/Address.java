package org.pack.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "address_tb")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int pincode;
	private String state;
	public int getId() {
		return id;
	}
	public int getPincode() {
		return pincode;
	}
	public String getState() {
		return state;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
