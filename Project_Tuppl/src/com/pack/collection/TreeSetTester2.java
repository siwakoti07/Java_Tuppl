package com.pack.collection;

import java.util.TreeSet;

public class TreeSetTester2 {

	public static void main(String[] args) {
		TreeSet<String> strings = new TreeSet<String>(new MyComparatorForDesc());
		strings.add("Raja");
		strings.add("Sita");
		strings.add("Rani");
		strings.add("Chor");

		for (String string : strings) {
			System.out.println(string);
		}

		System.out.println("-------------------");

		System.out.println(strings);

	}

}

