package com.pack.oops;

public class InstanceBlockTester {

	// instance/object block
	{
		System.out.println("first block statement");
	}

	{
		System.out.println("second block statement");
	}

	int var = 100;
	String name = "John";

	public static void main(String[] args) {
		InstanceBlockTester blockTester = new InstanceBlockTester();
		 System.out.println(blockTester.name);
	}
}

