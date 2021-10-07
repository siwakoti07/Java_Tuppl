package com.pack.collection;

public class ArrayCopy {

	public static void main(String[] args) {
		int [] arr1 = {1, 22, 44, 7, 39};
		int [] arr2 = arr1.clone();
		int [] arr3= new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr3.length);
		System.out.println("The elements of arr2 are: ");
		for (int i : arr2) {
			System.out.println(i+ " ");
		}
		System.out.println();
		for (int i : arr3) {
			System.out.println(i+ " ");
		}

	}

}
