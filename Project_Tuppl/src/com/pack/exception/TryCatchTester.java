package com.pack.exception;

public class TryCatchTester {

	public static void main(String[] args) {
		System.out.println("first line statement");
		System.out.println("second line statement");
		
		try {
		String x = null;
		System.out.println(x.length());
		}catch(NullPointerException npe) {
			System.out.println("Npe occureed!!!");
		}
		
		System.out.println("second last line statement");
		System.out.println("last line statement");
	}
	
}
