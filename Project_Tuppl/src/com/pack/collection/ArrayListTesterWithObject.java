package com.pack.collection;

import java.util.ArrayList;
import java.util.List;
import com.pack.array.Book;


public class ArrayListTesterWithObject {
	public static void main(String[] args) {
		// ArrayList of Book object type.
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("Angular", 555));
		books.add(new Book("JavaScript", 111));
		books.add(new Book("Html", 888));
		books.add(new Book("CSS", 999));

		for (Book book : books) {
			System.out.println(book);
		}
		

	}
}

