package org.pack.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "city_tb")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private int id;
	@Column(name = "city_name")
	private String name;
	@ManyToMany (mappedBy = "cities")
	private List<People> people;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<People> getPeople() {
		return people;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPeople(List<People> people) {
		this.people = people;
	}
	
}
