package com.pack.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTester {
	
	public static void main(String[] args) {
	
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\WritingTester.txt";
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(filePath, true);
			fos.write('Z');
			fos.write('A');
			fos.write(66);
			fos.write(97);
			fos.write('b');
			fos.write(105);
			fos.write(10);
			
			byte[] str = filePath.getBytes();
			fos.write(str);
			
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
