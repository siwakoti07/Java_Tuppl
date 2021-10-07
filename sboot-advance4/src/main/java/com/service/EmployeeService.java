package com.service;

import java.util.List;

import com.dao.EmployeeEntity;
import com.dto.EmployeeDto;

public interface EmployeeService {
	
	
	void registerEmployee(EmployeeDto employeeDto);
	List<EmployeeEntity> showall();
	EmployeeDto authenticateEmp(String email, String pswd);
	//void updateEmployee(EmployeeDto employeeDto);

}
