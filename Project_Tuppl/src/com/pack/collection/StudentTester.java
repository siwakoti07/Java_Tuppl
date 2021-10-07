package com.pack.collection;

import java.util.HashMap;
import java.util.Map;

public class StudentTester {

	public static void main(String[] args) {
		
		Student s1=new Student(1, "Sudip");
		Student s2=new Student(2, "Sujan");
		Student s3=new Student(3, "Rajan");
		Student s4=new Student(4, "Amar");
		Student s5=new Student(5, "Sandeep");
			
		Map <String, Integer> map = new HashMap<String, Integer>();
		map.put(s1.getName(), s1.getId());
		map.put(s3.getName(), s3.getId());
		map.put(s5.getName(), s5.getId());
		map.put(s4.getName(), s4.getId());
		map.put(s2.getName(), s2.getId());
		
		System.out.println(map);

	}

}
