package com.pack.collection;

import java.util.ArrayList;

public class ArrayListTester {
	public static void main(String[] args) {
		// create collection of int type.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		int noOfElementsInArrayList = arrayList.size();
		System.out.println("Arraylist size : " + noOfElementsInArrayList);

		arrayList.add(1);
		arrayList.add(98);
		arrayList.add(45);
		arrayList.add(36);
		arrayList.add(77);

		noOfElementsInArrayList = arrayList.size();
		System.out.println("Arraylist size : " + noOfElementsInArrayList);

		arrayList.add(99);

		noOfElementsInArrayList = arrayList.size();
		System.out.println("Arraylist size : " + noOfElementsInArrayList);

		boolean isElementPresent = arrayList.contains(45);
		System.out.println("is 45 present is arraylist : " + isElementPresent);
		isElementPresent = arrayList.contains(46);
		System.out.println("is 46 present is arraylist : " + isElementPresent);

		Object sixthElement = arrayList.get(5); // zero based index
		System.out.println("sixthElement is : " + sixthElement);

		boolean isArrayListEmpty = arrayList.isEmpty();
		System.out.println("Is Array List Empty  : " + isArrayListEmpty);
	}
}

