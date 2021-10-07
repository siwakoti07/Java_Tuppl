package org.pack.spring.bean;

public class Teacher {
	
	private int id;
	private String subject;
	
	public Teacher() {
		
	}
	public Teacher(int id, String subject) {
		this.id = id;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", subject=" + subject + "]";
	}
	
}
