package com.pack.collection;

public class TextBook implements Comparable<TextBook> {
	private String name;
	private int price;

	public TextBook() {
	}

	public TextBook(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "TextBook [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(TextBook textBook) {
		// current class field should be at left side for ascending order
		if (this.price < textBook.price) {
			return -1;
		} else if (this.price > textBook.price) {
			return 1;
		} else {
			return 0;
		}
	}

//	@Override
//	public int compareTo(TextBook textBook) {
//		// current class field should be at right side for descending order
//		if (textBook.price < this.price) {
//			return -1;
//		} else if (textBook.price > this.price) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}

}

