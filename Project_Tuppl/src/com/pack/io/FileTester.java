package com.pack.io;

import java.io.File;

public class FileTester {
	
	public static void main(String[] args) {

		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\WritingTester.txt";
		File file = new File(filePath);
		System.out.println("The name of file is : "+file.getName());
		System.out.println("The total space of drive is "+file.getTotalSpace());
		System.out.println("The length of file is: "+file.length());
		System.out.println("Absolute path: "+file.getAbsolutePath());
		System.out.println("File path: "+file.getPath());
	}

}
