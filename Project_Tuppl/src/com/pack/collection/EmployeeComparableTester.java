package com.pack.collection;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeComparableTester {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Sam", 101);
		Employee employee2 = new Employee("Jam", 104);
		Employee employee3 = new Employee("Ram", 107);
		Employee employee4 = new Employee("Shyam", 110);
		Employee employee5 = new Employee("Ron", 102);
		
		Set <Employee> set1=new TreeSet<Employee>();//(new EmployeeComparatorUsingId());;
		set1.add(employee1);
		set1.add(employee3);
		set1.add(employee2);
		set1.add(employee5);
		set1.add(employee4);
		
		for (Employee employee : set1) {
			System.out.println(employee);
		}

	}

}
