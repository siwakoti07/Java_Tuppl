package com.pack.oops;

public class StaticBlockTester {
	static {
		System.out.println("first block statement from instance block");
	}
	{
		System.out.println("second block statement from instance block");
	}
	public static void main(String[] args) {
		System.out.println("statement from main method !!!");
		//StaticBlockTester ref= new StaticBlockTester();
	}
	
	static {
		System.out.println("first block statement from static block");
	}
}

