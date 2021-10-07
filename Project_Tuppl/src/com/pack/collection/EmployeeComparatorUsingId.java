package com.pack.collection;

import java.util.Comparator;

public class EmployeeComparatorUsingId implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getEmpId() > e2.getEmpId()) {
			return 1;
		} else if (e1.getEmpId() < e2.getEmpId()) {
			return -1;
		} else {
			return 0;
		}
	}

}

