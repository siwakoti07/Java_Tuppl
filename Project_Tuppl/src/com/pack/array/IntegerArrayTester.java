package com.pack.array;

public class IntegerArrayTester {
	public static void main(String[] args) {
		int[] demoInts = { 9, 2, 3, 5 };
		demoInts[0] = 1;

		System.out.println("------" + demoInts[0]);

		for (int i = 0; i < demoInts.length; i++) {
			System.out.println(demoInts[i]);
		}

		System.out.println("------------------------------");

		Book[] books = { new Book("Rest API", 111), new Book("Spring Boot", 222) };

		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
	}
}

