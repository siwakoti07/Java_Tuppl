package org.pack.spring.tester;

import org.pack.spring.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTester {

	public static void main(String[] args) {
		
		//creating container
		ApplicationContext ac = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Student student = (Student) ac.getBean("stu");
		
		System.out.println("Student id: "+student.getId());
		System.out.println("Student name: "+student.getName());
		
		
	}

}
