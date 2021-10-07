package org.pack.tester;

import org.pack.bean.CarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarFactoryTester {

	public static void main(String[] args) {
	    ApplicationContext ac =	new ClassPathXmlApplicationContext("CarFactory.xml");
	    CarFactory factory = (CarFactory) ac.getBean("factory");
	    
	    System.out.println(factory);
	}
}
