package com.pack.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTester {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Z");
		set.add("V");
		set.add("X");
		set.add("R");
		set.add("C");
		set.add("R"); // this will get ignore while traversing

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}

	}

}

