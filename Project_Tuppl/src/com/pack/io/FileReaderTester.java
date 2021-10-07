package com.pack.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTester {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\WritingTester.txt";
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filePath);
			int data;
			while(true) {
				data = fileReader.read();
				if (data == -1)
					break;
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
