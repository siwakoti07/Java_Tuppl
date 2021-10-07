package com.pack.exception;

public class MyException extends Exception {
	private String my_ex;
	
	public MyException() {
		
	}

	public MyException(String MyException) {
		this.my_ex = MyException;
	}
	
	public String getmsg() {
		return this.my_ex;
	}
}
