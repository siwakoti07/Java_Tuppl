package com.pack.oops;

class Student {
	private int stuId;
	private String stuName;

	public Student() {
		System.out.println("zero parameterized constructor");
	}

	// parameterized constructor
	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		System.out.println("parameterized constructor");
	}

	public int getStuId() {
		return stuId;
	}

	public String getStuName() {
		return stuName;
	}

}

public class ConstructorTester {
	public static void main(String[] args) {
		// Student student = new Student();
		Student student = new Student(1, "ram");
		System.out.println(student.getStuId());
		System.out.println(student.getStuName());
	}
}
