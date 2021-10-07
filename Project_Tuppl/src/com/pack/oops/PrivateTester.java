package com.pack.oops;

class Dummy {
	public int x = 5;
	private String data = "secure data";

	private void show() {
		System.out.println("show method !!!");
	}

	public void print() {
		System.out.println("print method !!!" + data);
	}
}

public class PrivateTester {
	public static void main(String[] args) {
		Dummy dummyRef = new Dummy();
		System.out.println(dummyRef.x);
		// System.out.println(dummyRef.data);
		dummyRef.print();
		// dummyRef.show();
		
		Phone phone = new Phone();
		phone.battery();
	}
}

