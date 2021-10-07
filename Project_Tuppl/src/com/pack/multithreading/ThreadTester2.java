package com.pack.multithreading;

public class ThreadTester2 {
	public static void main(String[] args) {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("current thread name : " + Thread.currentThread().getName()+" : "+i);
				Thread.sleep(1000);
				// 1000ms = 1sec
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

