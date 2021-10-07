package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.dao.StudentEntity;

@Service
public class FactorilServiceImpl implements FactorialService {
	@Autowired
	StudentDao studentDao;

	@Override
	public int calFact(int no) {
	
		int fact=1;
		for(int i=2;i<=no;i++){
			
			fact=fact*i;
		}
		
		
		
		
		return fact;
	}

	@Override
	public void createStudent() {
		
		StudentEntity e1=new StudentEntity("prabhat",34);
		StudentEntity e2=new StudentEntity("susan",39);
		
		studentDao.save(e1);
		studentDao.save(e2);
	}

	@Override
	public int addition(int x, int y) {
		
		return x+y;
	}

}
