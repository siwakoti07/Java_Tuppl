package org.pack.spring.tester;


import org.pack.spring.bean.Line;
import org.pack.spring.bean.Point;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectInjectionTester {

	public static void main(String[] args) {
		
		//creating container
		//reading all beans from config file
		ApplicationContext ac = new ClassPathXmlApplicationContext("objectInjection.xml");
		
		//fetching bean from config file
		Point pt1 = (Point) ac.getBean("point1");
		Point pt2 = (Point) ac.getBean("point2");
		
		System.out.println(pt1);
		System.out.println(pt2);
		
		Line line = (Line) ac.getBean("line");
		System.out.println(line);
		
		
		
	}

}
