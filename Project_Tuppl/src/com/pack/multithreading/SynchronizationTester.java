package com.pack.multithreading;

class Greeter {
	public synchronized void wish(String name) {
		for (int i = 1; i <= 5; i++) {
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

class CustThread extends Thread {
	Greeter greeter;
	String name;

	public CustThread() {
	}

	public CustThread(Greeter greeter, String name) {
		this.greeter = greeter;
		this.name = name;
	}

	public void run() {
		greeter.wish(this.name);
	}
}

public class SynchronizationTester {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " thread started !!!");
		Greeter greeter = new Greeter();

		CustThread customThread1 = new CustThread(greeter, "Dhoni");
		customThread1.setPriority(Thread.MIN_PRIORITY);
		customThread1.start();

		CustThread customThread2 = new CustThread(greeter, "Kohli");
		customThread1.setPriority(6);
		customThread2.start();

		CustThread customThread3 = new CustThread(greeter, "Yuvraaj");
		customThread1.setPriority(3);
		customThread3.start();

		CustThread customThread4 = new CustThread(greeter, "Sachin");
		customThread1.setPriority(9);
		customThread4.start();

		CustThread customThread5 = new CustThread(greeter, "Sehwag");
		customThread1.setPriority(Thread.MAX_PRIORITY);
		customThread5.start();

		System.out.println(Thread.currentThread().getName() + " thread ended !!!");
	}
}

