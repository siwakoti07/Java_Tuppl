package com.pack.multithreading;

public class DaemonThreadTester {
	public static void main(String[] args) {

		Thread thread = Thread.currentThread();
		System.out.println("current thread name : " + thread.getName());
		System.out.println("is " + thread.getName() + " thread is a daemon thread :" + thread.isDaemon());

		// thread.setDaemon(true);
		System.out.println("is " + thread.getName() + " thread is a daemon thread :" + thread.isDaemon());

		System.out.println("==================CUSTOM THREAD=============================");

		CustThread custThread = new CustThread();
		System.out.println("is " + custThread.getName() + " thread is a daemon thread :" + custThread.isDaemon());

		custThread.setDaemon(true);

		System.out.println("is " + custThread.getName() + " thread is a daemon thread :" + custThread.isDaemon());

	}
}

