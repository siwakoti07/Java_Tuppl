package com.pack.collection;

public class Employee implements Comparable<Employee>{

	private String name;
	private int empId;

	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public Employee(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return (this.name.compareToIgnoreCase(emp.name));
		
	}

}

