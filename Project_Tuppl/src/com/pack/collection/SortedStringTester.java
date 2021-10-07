package com.pack.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortedStringTester {
	
	public static void main(String args[]) {
		List <String> str = new ArrayList<String>();
		
		str.add("ZCS");
		str.add("ZAS");
		str.add("ACS");
		str.add("AAS");
		str.add("ZCS");
		
		System.out.println("Before Sorting:");
		Iterator <String> itr = str.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		Collections.sort(str);
		System.out.println("After Sorting");
		Iterator <String> itr1 = str.iterator();
		while(itr1.hasNext()) {
			String s = itr1.next();
			System.out.println(s);
		}
	}

}
