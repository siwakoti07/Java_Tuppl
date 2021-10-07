package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.dao.EmployeeEntity;
import com.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void registerEmployee(EmployeeDto employeeDto) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		BeanUtils.copyProperties(employeeDto, employeeEntity);
		employeeDao.save(employeeEntity);
	}

	@Override
	public List<EmployeeEntity> showall() {
		List<EmployeeEntity> empList = employeeDao.findAll();
		
		return empList;
	}
	
	@Override
	public EmployeeDto authenticateEmp(String email, String pswd) {

		Optional<EmployeeEntity> optional=employeeDao.findByEmailIdAndPassword(email, pswd);
		
		if(optional.isPresent()){	
			EmployeeEntity employeeEntity=optional.get();
			EmployeeDto employeeDto=new EmployeeDto();
			BeanUtils.copyProperties(employeeEntity, employeeDto);
			return employeeDto;		
		}	
		return null;
	}

//	@Override
//	public void updateEmployee(EmployeeDto employeeDto) {
//		EmployeeEntity ee = new EmployeeEntity();
//		BeanUtils.copyProperties(employeeDto, ee);
//		employeeDao.save(ee);
//		
//	}


}
