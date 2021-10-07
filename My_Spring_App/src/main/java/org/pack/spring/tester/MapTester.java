package org.pack.spring.tester;


import org.pack.spring.bean.Friends;
import org.pack.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapTester {

	public static void main(String[] args) {
		
		//creating container
		//reading all beans from config file
		ApplicationContext ac = new ClassPathXmlApplicationContext("CollectionMapping.xml");
		
		//fetching bean from config file
		Person p1 = (Person) ac.getBean("person1");
		Person p2 = (Person) ac.getBean("person2");
		Person p3 = (Person) ac.getBean("person3");
		Friends friend = (Friends) ac.getBean("friends");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(friend);
	}

}
