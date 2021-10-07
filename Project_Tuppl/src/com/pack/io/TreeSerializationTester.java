package com.pack.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TreeSerializationTester {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Siwakoti\\Desktop\\java\\Tree.ser";

		Tree tree = new Tree(111, "Banyan");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filePath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(tree);
			System.out.println("Writing is done !!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}

