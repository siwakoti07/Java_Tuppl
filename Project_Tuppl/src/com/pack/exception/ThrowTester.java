package com.pack.exception;

public class ThrowTester {

	public static void main(String[] args) {
		
		String x = null;
		if(x==null) {
			throw new NullPointerException();
		}else {
			System.out.println(x.length());
		}
	}

}
