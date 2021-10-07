package com.pack.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBookTester {
	public static void main(String[] args) {
//		ArrayList of Book object type.
		List<TextBook> books = new ArrayList<TextBook>();
//		ArrayList<Student> students = new ArrayList<Student>(); 
		
//		students.add(new Student(44,"Rajan"));
//		students.add(new Student(33,"Sujan"));
//		students.add(new Student(11,"Sudip"));
//		students.add(new Student(55,"Sandip"));
//		students.add(new Student(22,"Kabindra"));

		books.add(new TextBook("CSS", 999));
		books.add(new TextBook("Angular", 555));
		books.add(new TextBook("JavaScript", 111));
		books.add(new TextBook("Html", 888));
		

		System.out.println("before sorting");
		for (TextBook book : books) {
			System.out.println(book);
		}
		
		Comparator<TextBook> txt = new Comparator<TextBook>() {

			@Override
			public int compare(TextBook txt1, TextBook txt2) {
				return txt1.getName().compareTo(txt2.getName()); //{
//					return 1;
//				}
//				else 
//					return -1;
			}
			
		};

	//	Collections.sort(books);;

//		System.out.println("After sorting");
//		for (TextBook book : books) {
//			System.out.println(book);
//		}
//		
		Collections.sort(books, txt);
		System.out.println("After sorting with comparator");
		for (TextBook book : books) {
			System.out.println(book);
		}
//		for (Student student : students) {
//			System.out.println(student);
//		}
//		Collections.sort(students);
//		for (Student student : students) {
//			System.out.println(student);
//		}
	}
}
