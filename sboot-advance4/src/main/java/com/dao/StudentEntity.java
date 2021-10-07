package com.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentEntity {

	int sid;
	String name;
	int age;
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity( String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	@Id
	@GeneratedValue
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
	
}
