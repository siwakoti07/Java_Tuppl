package com.pack.oops;

public class ThisTester {

	public int myIntVar = 5;

	public void demo() {
		System.out.println("demo method !!!");
	}

	public void show() {
		System.out.println("show method !!!");
		demo();
		System.out.println("ThisTester reference with this keyword : " + this);
	}

	public static void main(String[] args) {
		ThisTester thisTester = new ThisTester();
		thisTester.show();
		System.out.println("ThisTester reference : " + thisTester);
		
		System.out.println("=============================================================");
		
		ThisTester thisTester2 = new ThisTester();
		System.out.println("ThisTester reference : " + thisTester2);
		thisTester2.show();
	}

}

