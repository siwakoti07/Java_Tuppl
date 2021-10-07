package com.pack.oops;

class MobileOS {
	public final void basePlatform() {
		System.out.println("from basePlatform of core OS !!!");
	}
}

class Android extends MobileOS {
	// Cannot override the final method from MobileOS
	// public void basePlatform() {
	// System.out.println("from basePlatform of android OS!!!");
	// }
}

public class FinalWidMethodTester {
	public static void main(String[] args) {
		Android android = new Android();
		android.basePlatform();
	}
}
