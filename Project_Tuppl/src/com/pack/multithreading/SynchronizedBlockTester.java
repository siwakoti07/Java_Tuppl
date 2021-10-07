package com.pack.multithreading;

class Wisher {
	public void wish(String name) {
		for (int i = 1; i <= 5; i++) {
			synchronized (this) {
				System.out.print("Good Morning - ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name);
			}
		}
	}
}

class CusThread extends Thread {
	Wisher wisher;
	String name;

	public CusThread() {
	}

	public CusThread(Wisher wisher, String name) {
		this.wisher = wisher;
		this.name = name;
	}

	public void run() {
		wisher.wish(this.name);
	}
}

public class SynchronizedBlockTester {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " thread started !!!");
		Wisher wisher = new Wisher();

		CusThread customThread1 = new CusThread(wisher, "Dhoni");
		customThread1.setPriority(Thread.MIN_PRIORITY);
		customThread1.start();

		CusThread customThread2 = new CusThread(wisher, "Kohli");
		customThread1.setPriority(6);
		customThread2.start();

		System.out.println(Thread.currentThread().getName() + " thread ended !!!");
	}
}

