package com.pack.io;

//import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamWithTryWithResourceTester {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\Checker.txt";
		try (FileInputStream fis = new FileInputStream(filePath)) {
			int dataInIntType = fis.read();
			System.out.println("----" + (char) dataInIntType);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// finally {
		// try {
		// fis.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }

	}

}

