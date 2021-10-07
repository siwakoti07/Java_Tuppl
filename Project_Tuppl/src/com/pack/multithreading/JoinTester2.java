package com.pack.multithreading;

class MyCustThread2 implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("starts------run from MyCustThread class !!!");
			Thread.currentThread().join(1000); // MyCustThread2 thread will join the execution once main thread completes
											// its life cycle
			System.out.println("ends ----------run from MyCustThread class !!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class JoinTester2 {
	public static void main(String[] args) {
		MyCustThread2 customThread = new MyCustThread2();
		Thread thread = new Thread(customThread);
		thread.start();
		System.out.println("main from JoinTester class !!!");
	}
}
