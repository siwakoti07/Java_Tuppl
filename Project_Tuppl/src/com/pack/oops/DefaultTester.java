package com.pack.oops;

class Mouse {
	int a = 5;
}

public class DefaultTester {
	//int a = 5;

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		int myvar = mouse.a;
		System.out.println("myvar value : " + myvar);
	}
}

