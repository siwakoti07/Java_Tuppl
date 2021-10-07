package org.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person_tb")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int id;
	@Column(name = "person_name")
	private String name;
	@OneToOne
	private Passport passport;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	
}
