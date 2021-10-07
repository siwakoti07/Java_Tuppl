package com.pack.collection;

import java.util.TreeSet;

public class TreeSetTester {

	public static void main(String[] args) {
		//by default  , natural ordering
		TreeSet<String> strings = new TreeSet<String>();
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