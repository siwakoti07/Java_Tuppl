package com.pack.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TreeDeserializationTester {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\Tree.ser";

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(filePath);
			ois = new ObjectInputStream(fis);

			Tree tree = (Tree) ois.readObject();
			System.out.println("Tree age : " + tree.getAge());
			System.out.println("Tree name : " + tree.getName());

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

