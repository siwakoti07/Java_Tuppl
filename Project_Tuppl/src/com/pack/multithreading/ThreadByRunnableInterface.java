package com.pack.multithreading;

class MyCustomThreadWithRunnable implements Runnable {
	public void run() {    // execution of thread gets started from here i.e. from run() method
		Thread.currentThread().setName("CustomRunnable");
		System.out.println("from " + Thread.currentThread().getName() + " thread !!!");
	}
}

public class ThreadByRunnableInterface {
	public static void main(String[] args) {
		//System.out.println("from " + Thread.currentThread().getName() + " thread !!!");
		// use argumented constructor of the thread
		// new Thread(Runnable ref);
		MyCustomThreadWithRunnable targetThread = new MyCustomThreadWithRunnable();
		Thread thread = new Thread(targetThread);
		thread.start();
		
		System.out.println("from " + Thread.currentThread().getName() + " thread !!!");

	}
}

