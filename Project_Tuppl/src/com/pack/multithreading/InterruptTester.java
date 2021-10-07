package com.pack.multithreading;

class CustomThread implements Runnable {
	@Override
	public void run() {
		try {
			Thread.currentThread().setName("MyCustThread");
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " is lazy thread !!!");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class InterruptTester {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " thread starts !!!");
		CustomThread customThread = new CustomThread();
		Thread thread = new Thread(customThread);
		thread.start();
		thread.interrupt();
		System.out.println(Thread.currentThread().getName() + " thread ends !!!");
	}
}
