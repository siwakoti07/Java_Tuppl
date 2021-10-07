package com.pack.exception;

public class TryFinallyTester {

	public static void main(String[] args) {
		System.out.println("first line statement");
		System.out.println("second line statement");
		
		try {
		String x = null;
		System.out.println(x.length());
		}finally {
			System.out.println("I will always execute");
		}
		
		System.out.println("second last line statement");
		System.out.println("last line statement");
	}
	
}
