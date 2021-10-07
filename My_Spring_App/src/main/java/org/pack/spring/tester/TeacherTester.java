package org.pack.spring.tester;

import org.pack.spring.bean.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTester {

	public static void main(String[] args) {
		
		//creating container
		//reading all beans from config file
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		//fetching bean from config file
		Teacher teacher = (Teacher) ac.getBean("teach");
		
		System.out.println(teacher);
		
		
	}

}
