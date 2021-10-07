package com.pack.oops;

class Speaker {
	public String name;
	public int price;

	public Speaker() {
		this("JBL");
		// Speaker("JBL"); //The method Speaker(String) is undefined for the type
		// Speaker
		System.out.println("default constructor");
	}

	public Speaker(String name) {
		this("JBL", 999);
		System.out.println("One arg constructor " + name);
	}

	public Speaker(String name, int price) {
		System.out.println("Two arg constructor " + name + " , " + price);
	}
}

public class ThisWidConstructorTester {
	public static void main(String[] args) {
		Speaker speake = new Speaker();
		Speaker speak = new Speaker("JBL");
		Speaker speaker = new Speaker("JBL",111);
		
	}
}

