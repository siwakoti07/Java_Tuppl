package org.pack.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "country_tb")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@ElementCollection
	private List<String> cities;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
}
