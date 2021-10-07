package com.pack.multithreading;

class MyCustThread3 implements Runnable {
	@Override
	public void run() {
		try {
			Thread.currentThread().setName("MyCustThread");
			for (int i = 0; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class JoinTester3 {
	public static void main(String[] args) {
		try {
			MyCustThread3 customThread = new MyCustThread3();
			Thread thread = new Thread(customThread);
			thread.start();
			 thread.join(10000); // main thread will wait only for 10 seconds
			//thread.join(); // main thread will wait till child thread gets completed
			for (int i = 0; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " thread");
			}
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

