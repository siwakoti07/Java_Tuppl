package com.pack.collection;

import java.util.TreeSet;

public class EmployeeSortingTester {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Sam", 101);
		Employee employee2 = new Employee("Jam", 104);
		Employee employee3 = new Employee("Ram", 107);
		Employee employee4 = new Employee("Shyam", 110);
		Employee employee5 = new Employee("Ron", 102);

		// TreeSet<Employee> employees = new TreeSet<>(); //needs comparable object
		TreeSet<Employee> employees = new TreeSet<>(new EmployeeComparatorUsingId());
		// sorting on the basis of Emp id
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

		for (Employee employee : employees) {
			System.out.println(employee.getName() + " " + employee.getEmpId());
		}

		System.out.println("======================================");

		TreeSet<Employee> emps = new TreeSet<>(new EmployeeComparatorUsingName());
		// sorting on the basis of Emp name
		emps.add(employee1);
		emps.add(employee2);
		emps.add(employee3);
		emps.add(employee4);
		emps.add(employee5);

		for (Employee employee : emps) {
			System.out.println(employee.getName() + " " + employee.getEmpId());
		}

	}

}

