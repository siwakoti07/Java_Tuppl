package com.pack.multithreading;

class MyCustomThreadWithRunnable2 implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : "+i);
		}
	}
}

public class ThreadByRunnableInterface2 {
	public static void main(String[] args) {
		MyCustomThreadWithRunnable2 targetThread = new MyCustomThreadWithRunnable2();
		Thread thread = new Thread(targetThread);
		thread.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = "+ i);
		}
		
	}
}