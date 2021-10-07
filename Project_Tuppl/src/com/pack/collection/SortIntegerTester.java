package com.pack.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerTester {
	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(10);
		integers.add(98);
		integers.add(45);
		integers.add(36);
		integers.add(77);

		System.out.println("---before sorting---");
		for (Integer integer : integers) {
			System.out.println("----" + integer);
		}
		
		System.out.println("---after sorting---");
		Collections.sort(integers);
		
		for (Integer integer : integers) {
			System.out.println("----" + integer);
		}
		

	}
}

