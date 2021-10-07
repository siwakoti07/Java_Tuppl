package com.pack.collection;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListTester3 {

	public static void main(String[] args) {
		
		ArrayList <String> pandavs = new ArrayList <String>();
		pandavs.add("Yudhisthira");
		pandavs.add("Bhima");
		pandavs.add("Arjuna");
		pandavs.add("Nakula");
		pandavs.add("Sahadeva");
		System.out.println("The length of the arraylist is: "+pandavs.size());
		
		for (int i = 0; i < pandavs.size(); i++) {
			System.out.println("Pandav number "+(i+1)+" is "+ pandavs.get(i)+".");
		}
		
		System.out.print("\nThe names of Pandavas are: ");
		for (String names : pandavs) {
			System.out.print(names+" ");
		}
		
		System.out.println("\n---------------------\n");
			Iterator<String> iterator = pandavs.iterator(); 
			while(iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
			
	}

}
