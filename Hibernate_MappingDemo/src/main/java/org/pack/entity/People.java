package org.pack.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "people_tb")
public class People {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "people_id")
	private int id;
	@Column(name = "people_name")
	private String name;
	@ManyToMany
	@JoinTable(name = "people_city_tb", joinColumns = @JoinColumn(name = "city_id"), inverseJoinColumns = @JoinColumn(name = "people_id"))
	private List<City> cities;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

}
