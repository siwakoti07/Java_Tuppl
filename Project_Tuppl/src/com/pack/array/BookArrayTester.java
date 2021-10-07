package com.pack.array;

public class BookArrayTester {
	public static void main(String[] args) {

		Book[] books = new Book[4];
		books[0] = new Book("Java", 999);
		Book book1 = new Book("Hibernate", 777);
		books[1] = book1;
		books[2] = new Book("Spring", 666);
		books[3] = new Book("Angular", 555);
		
		System.out.println(books[0].getName()+ " book of "+books[0].getPrice() + " price");
		System.out.println(books[1].getName()+ " book of "+books[1].getPrice() + " price");
		System.out.println(books[2].getName()+ " book of "+books[2].getPrice() + " price");
		System.out.println(books[3].getName()+ " book of "+books[3].getPrice() + " price");

		System.out.println("=====================================");
		
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].getName()+ " book of "+books[i].getPrice() + " price");
		}
		
	}
}
