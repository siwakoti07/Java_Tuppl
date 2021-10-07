package com.pack.multithreading;

class MyCustomThread extends Thread {
	public void run() { // execution of thread gets started from here i.e. from run() method
		Thread.currentThread().setName("Custom");
		System.out.println("from " + Thread.currentThread().getName() + " thread !!!");
	}
}

public class ThreadByThreadClass {
	public static void main(String[] args) {
		System.out.println("from " + Thread.currentThread().getName() + " thread !!!");
		MyCustomThread myCustomThread = new MyCustomThread();
		myCustomThread.start(); // initializing the thread
		//myCustomThread.start(); // initializing the thread
	}
}

