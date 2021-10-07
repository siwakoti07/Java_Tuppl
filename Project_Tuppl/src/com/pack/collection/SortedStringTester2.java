package com.pack.collection;

import java.util.Iterator;
import java.util.Set;
//import java.util.SortedSet;
import java.util.TreeSet;

public class SortedStringTester2 {
	
	public static void main(String args[]) {
		Set <String> str = new TreeSet<String>();
		
		str.add("ZCS");
		str.add("ZAS");
		str.add("ACS");
		str.add("AAS");
		str.add("ZCS");
		
		Iterator <String> itr = str.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
	}

}
