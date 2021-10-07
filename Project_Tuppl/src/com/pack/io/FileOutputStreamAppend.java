package com.pack.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamAppend {
	
	public static void main(String[] args) {
	
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\WritingTester.txt";
		String append= "This is the string appended to the existing file";
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(filePath, true);
			
			byte[] b = append.getBytes();
			fos.write(10);
			fos.write(b);
			
			System.out.println("Writing is complete.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	}

}
