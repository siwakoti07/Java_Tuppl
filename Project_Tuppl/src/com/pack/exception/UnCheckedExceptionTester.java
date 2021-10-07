package com.pack.exception;

public class UnCheckedExceptionTester {

	public static void main(String[] args) {

		String data = null;
		try {
			System.out.println("lenght of data : " + data.length());
		} catch (NullPointerException e) {
			System.out.println("NPE happened !!!");
		}

		try {
			int x = 5;
			int y = 0;
			int z = x / y;
			System.out.println("Division of x/y is : " + z);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			//System.out.println("arithmetic exception!!!");
		}

		System.out.println("last line !!!");
	}

}

