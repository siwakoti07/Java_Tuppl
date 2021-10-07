package org.pack.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageResourceTester {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("readingPropertiesFile.xml");
		String message = ac.getMessage("greet", null , "This is default message", null);
		String msg1 = ac.getMessage("fruits", null , "This is default message", null);
		System.out.println(message);
		System.out.println(msg1);
	}

}
