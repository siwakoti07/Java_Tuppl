package com.pack.exception;

public class TryFinallyTester2 {

	public static void main(String[] args) {
		System.out.println("first line statement");
		System.out.println("second line statement");
		
		try {
		String x = null;
		System.out.println(x.length());
		}catch(NullPointerException npe) {
			System.out.println("Npe occureed!!!");
		}finally {
			System.out.println("I will always execute");
		}
		
		System.out.println("second last line statement");
		System.out.println("last line statement");
	}
	
}
