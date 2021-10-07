package com.pack.exception;

public class CustomExceptionTester {

	public static void main(String[] args) {

		int age = 12;
		System.out.println("Party starts!!");
		
		try {
			if(age < 18) {
				throw new AgeException("Person is minor!!");
			}
			else {
				System.out.println("ENJOY!!");
			}
		} catch(AgeException ae) {
			ae.printStackTrace();
		}

	}

}
