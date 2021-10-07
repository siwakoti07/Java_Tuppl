package com.pack.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionWidThrowsTester {

	public void show() throws FileNotFoundException {
		System.out.println("show method !!!");
		foo(); // OR this.foo();
		FileInputStream fileInputStream = new FileInputStream("dummy11.txt");
	}

	public void print() throws FileNotFoundException {
		System.out.println("print method !!!");
		show();
	}

	public void foo() {
		System.out.println("foo method");
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("first line of main method");
		CheckedExceptionWidThrowsTester tester = new CheckedExceptionWidThrowsTester();
		tester.print();
		System.out.println("last line of main method");
	}

}

