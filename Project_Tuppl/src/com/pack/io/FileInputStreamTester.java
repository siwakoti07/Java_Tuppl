package com.pack.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTester {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\Checker.txt";
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(filePath);
			int dataInIntType;
			while(true) {
			dataInIntType = fis.read();
			if(dataInIntType == -1) {
				break;
			}
			System.out.print((char)dataInIntType);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
