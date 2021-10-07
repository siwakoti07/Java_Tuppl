package com.pack.collection;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student() {
		
	}
	public Student (int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Student's name is " + name + " and id is "+ id +".";
	}
	@Override
	public int compareTo(Student o) {
		if(this.id < o.id) {
			return -1;
		}
		else if(this.id > o.id){
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
