package com.pack.oops;

class Keyboard {
	public final int noOfKeys = 101;

	public void countKeys() {
		System.out.println("No of keys in old keyboard are :" + noOfKeys);
		// The final field Keyboard.noOfKeys cannot be assigned
	    //noOfKeys = 110;
		System.out.println("No of keys in new keyboard are :" + noOfKeys);
	}
}

public class FinalWidFieldTester {
	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();
		keyboard.countKeys();
	}
}