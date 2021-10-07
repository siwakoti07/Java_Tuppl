package com.pack.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTester2 {
	public static void main(String[] args) {
		// create collection of int type.

		// generic collection
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(98);
		integers.add(45);
		integers.add(36);
		integers.add(77);

		// 1st way;
		for (int i = 0; i < integers.size(); i++) {
			System.out.println("integers.get(" + i + ") : " + integers.get(i));
		}

		System.out.println("===================");

		// 2nd way:
		for (Integer integer : integers) {
			System.out.println("----" + integer);
		}

		System.out.println("*************************");
		
		// 3rd way by using Iterator <I>
		Iterator<Integer> itr = integers.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}

		//create collection of string type.
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("abc");
		strings.add("def");
		strings.add("hgf");
		strings.add("xyz");
	}
}
