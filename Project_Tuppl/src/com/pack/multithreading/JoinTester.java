package com.pack.multithreading;

class MyCustThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++)	{
		System.out.println("run from MyCustThread class !!!");
		}
	}
}

public class JoinTester {
	public static void main(String[] args) {
		try {
			MyCustThread customThread = new MyCustThread();
			Thread thread = new Thread(customThread);
			thread.start();
			thread.join(); // main thread will join the execution once child thread completes its life
			for(int i = 0; i < 10; i++)	{		 // cycle
			System.out.println("main from JoinTester class !!!");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// javac MyTester.java
// java MyTester

