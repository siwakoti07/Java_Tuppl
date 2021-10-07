package com.pack.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//import com.pack.array.Book;

public class LinkedListTester {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(1);
		list.add(9);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
		
//		for (Integer x : list) {
//			System.out.println(x);
//		}

	}

}

