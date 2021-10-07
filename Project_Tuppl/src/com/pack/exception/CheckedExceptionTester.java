package com.pack.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionTester {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fileInputStream = new FileInputStream("abc.xyz");

	}

}
