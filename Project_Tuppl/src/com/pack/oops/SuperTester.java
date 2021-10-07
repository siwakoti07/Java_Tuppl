package com.pack.oops;

class GrandParentTest {
	public int x = 5;
	public void dummy() {
		System.out.println("dummy method from GrandParent !!!");
	}
}

class ParentTest extends GrandParentTest {
	public int y = 3;
	public void dummy() {
		System.out.println("dummy method from Parent !!!");
	}
}

class ChildTest extends ParentTest {
	public ChildTest() {
		System.out.println("value of y from Parent  : " + super.y);
	    System.out.println("value of x from GrandParent  : " + super.x);
		super.dummy();	 
	}

	public int z = 1;
}

public class SuperTester {
	public static void main(String[] args) {
		ChildTest childTest = new ChildTest();
		//System.out.println("value of z from Child  : " + childTest.z);
		//childTest.dummy();
	}
}

