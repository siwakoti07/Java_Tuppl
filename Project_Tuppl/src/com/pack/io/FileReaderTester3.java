package com.pack.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTester3 {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\WritingTester.txt";
		FileReader fileReader = null;
		BufferedReader br = null;
		try {
			fileReader = new FileReader(filePath);
			br = new BufferedReader(fileReader);
			String data= "";
			
			while(true) {
		    data = br.readLine();
			if(data == null)
				break;
			System.out.println(data);
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
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
