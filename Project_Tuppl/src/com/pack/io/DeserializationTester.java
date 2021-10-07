package com.pack.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTester {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\serial.ser";

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);

			Fan fan = (Fan) ois.readObject();
			System.out.println("Fan price : " + fan.getPrice());
			System.out.println("Fan name : " + fan.getName());
//			Tree t = (Tree) ois.readObject();
//			System.out.println("Tree age : " + t.getAge());
//			System.out.println("Tree name : " + t.getName());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

