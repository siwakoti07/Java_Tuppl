package com.pack.multithreading;

class MyCustomThreadWithRunnable3 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " ");
	}
}

public class ThreadByRunnableInterface3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " from Tester");

		MyCustomThreadWithRunnable3 targetThread = new MyCustomThreadWithRunnable3();
		Thread thread = new Thread(targetThread);
		 thread.start();
		targetThread.run();
		// regular method calling. so no thread gets created.In this example we have
		// only one thread i.e. main thread

	}
}
