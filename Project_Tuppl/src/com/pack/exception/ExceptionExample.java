package com.pack.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {
	
	public void fileReader() throws FileNotFoundException{
		System.out.println("This method tries to read a file.");
		try {
		FileInputStream fs = new FileInputStream("abc.txt");
		}catch(FileNotFoundException fn) {
			fn.printStackTrace();
		}
	}	
	public void print() {
		int numOfEx = 99;
		System.out.println("This is a message in print method.");
		try {
			if (numOfEx < 100) {
				throw new MyException("You do not have enough exes.");
			}
			else {
				System.out.println("You have lived your life.");
			}
		} catch (MyException Ex){
			System.out.println(Ex.getmsg());
			Ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ExceptionExample ee = new ExceptionExample();
		ee.print();
		ee.fileReader();
		System.out.println("This is the end!!!");
	}

}
