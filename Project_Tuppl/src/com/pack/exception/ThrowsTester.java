package com.pack.exception;

import com.pack.oops.Tester;

public class ThrowsTester {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("before exception");
		
		Class<Tester> tester = (Class<Tester>) Class.forName("com.pack.oops.Tester");
		
		System.out.println("After exception");
		System.out.println("Class to be loaded in memory: "+tester.getName());
	}

}
