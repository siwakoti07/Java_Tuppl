package com.pack.collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTester {

	public static void main(String[] args) {
		SortedSet<Integer> sortedSet = new TreeSet<Integer>();

		sortedSet.add(9);
		sortedSet.add(1);
		sortedSet.add(5);
		sortedSet.add(2);
		sortedSet.add(4);
		sortedSet.add(4);

		Iterator<Integer> itr = sortedSet.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
	}

}

