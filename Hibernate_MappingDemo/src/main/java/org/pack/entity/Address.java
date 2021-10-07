package org.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "address_tb")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int id;
	@Column(name = "address_pincode")
	private int pincode;
	@Column(name = "address_state")
	private String state;
	@ManyToOne
	private Employee employee;
	
	public int getId() {
		return id;
	}
	public int getPincode() {
		return pincode;
	}
	public String getState() {
		return state;
	}
	public Employee getEmployee() {
		return employee;
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
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
