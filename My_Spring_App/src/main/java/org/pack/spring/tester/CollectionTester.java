package org.pack.spring.tester;


import org.pack.spring.bean.Point;
import org.pack.spring.bean.Rectangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTester {

	public static void main(String[] args) {
		
		//creating container
		//reading all beans from config file
		ApplicationContext ac = new ClassPathXmlApplicationContext("CollectionMapping.xml");
		
		//fetching bean from config file
		Point pt1 = (Point) ac.getBean("point1");
		Point pt2 = (Point) ac.getBean("point2");
		Point pt3 = (Point) ac.getBean("point3");
		Point pt4 = (Point) ac.getBean("point4");
		
		Rectangle rect = (Rectangle) ac.getBean("rectangle");
		
		
		System.out.println(pt1);
		System.out.println(pt2);
		System.out.println(pt3);
		System.out.println(pt4);
		System.out.println(rect);
		
		
	}

}
